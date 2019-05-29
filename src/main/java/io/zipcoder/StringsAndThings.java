package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

        Integer count = 0;

        for(int i = 0; i < input.length(); i++) {

            if((input.charAt(i) == 'y') || (input.charAt(i) == 'z')) {
                if (i + 1 >= input.length()) {
                    count++;
                } else if (input.charAt(i + 1) == ' ') {
                    count++;
                } else if (input.charAt(i + 1) == '.') {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        String result = "";
        String check = "";
        Boolean match = false;

        for(int i = 0; i < base.length(); i++) {

            //Check to make sure there is enough characters left to check
            if(i + remove.length() <= base.length()) {

                check = "";

                // Loop through and see if it matches remove
                for (int j = 0; j < remove.length(); j++) {

                    check += base.charAt(i + j);

                    if(check.equals(remove)) match = true;

                }

                //if match skip and dont print
                if(match){

                    i += remove.length() - 1;
                    match = false;

                }
                else {

                    result += base.charAt(i);

                }

            }
            else {

                result += base.charAt(i);
            }

        }

        return result;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        int numberOfIs = 0;
        int numberOfNot = 0;
        String check = "";

        for(int i = 0; i < input.length(); i++){


            // Check for is
            if((input.charAt(i) == 'i') && (i + 1 < input.length())) {

                check = input.substring(i, i + 2);
                if(check.equals("is")) numberOfIs++;

            }

            // Check for not
            if((input.charAt(i) == 'n') && (i + 2 < input.length())) {


                check = input.substring(i, i + 3);
                if (check.equals("not")) numberOfNot++;
            }


        }


        return (numberOfIs == numberOfNot);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

        Boolean isHappy = false;
        Boolean isLeftG = false;
        Boolean isRightG = false;

        if(input.contains("g")) {

            System.out.println("found a g");

            isHappy = true;

            // Loop through input
            for(int i = 0; i < input.length(); i++) {

                // Check left and Right
                if(input.charAt(i) == 'g') {

                    if((i + 1 < input.length()) && (input.charAt(i + 1) == 'g')) isRightG = true;

                    if((i - 1 >= 0) && (input.charAt(i - 1) == 'g')) isLeftG = true;

                    System.out.println("index: " + i);
                    System.out.println(isLeftG);
                    System.out.println(isRightG);


                    // If no second g, exit loop.
                    // Otherwise continue to check
                    if((!isLeftG) && !isRightG) {

                        System.out.println("ending method");

                        isHappy = false;
                        break;

                    }
                    else {

                        //reset left and right
                        isLeftG = false;
                        isRightG = false;

                    }


                    System.out.println("is Happy: " + isHappy + "\n");

                }
            }
        }

        System.out.println("retuning: " + isHappy);

        return isHappy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){

        Integer count = 0;
        Character check = null;
        Boolean isTriple = false;


        //Loop through input
        //If possible check next three characters
        //If all the same add to count

        for(int i = 0; i < input.length(); i++) {

            check = input.charAt(i);

            if(i + 2 < input.length()) {

                for(int j = 1; j < 3; j++) {

                    if(input.charAt(i + j) != check) break;
                    if(j == 2) count++;

                }

            }

        }

        return count;
    }
}
