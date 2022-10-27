package se.lexicon;



  /**
   public static void clear(), public static String[] findByFirstName(final String firstName)   for farhad


   public static String[] findAll(), public static boolean add(final String fullName) ; lilly


   -findByLastName,  boolean remove(final String fullName) ; sam


    find full name,    update; Nivethitha

**/
   public class NameRepository {


    /* Veronica
    Inside NameRepository create a private static empty array of String called names.
    SUGGESTIONS:  */
    private static String names[] = new String[]{};

    /* Veronica
    public static int getSize()
    Returns number of elements in the array
    SUGGESTIONS: */
    public static int getSize() {

    } //Should have a Return!

    /* Who?
    public static void setNames(String[] names)
    Sends in an array that set the private static array.
    This should replace all existing names.
    SUGGESTIONS:  */
    public static void setNames(String[] names) {

    }

    /*Farhad
    public static void clear()
    Should completely empty the array.
    SUGGESTIONS: V:String[0] will works! S: yes it works   */
    public static void clear() {
    } //Should have a Return!

    /* Nivethitha
    public static String find(final String fullName)
    Returns name if found and null if not found.
    SUGGESTIONS:  */
    public static String find(final String fullName) {

    } //Should have a Return!

    /* Lilly
    public static boolean add(final String fullName)
    Should add a new name to the array.
    Returns true when name was added and false when the array contains the name.
    SUGGESTIONS:  */
    public static boolean add(final String fullName) {

    /* Farhad
    public static String[] findByFirstName(final String firstName)
    Searches the array trying to find all names that has passed in first name.
    Returns a String array containing all matches.
    SUGGESTIONS:  */
    public static String[] findByFirstname(final String firstName) {
    }

































       public static String find(final String fullName) {
    } //Should have a Return!

    /* Samuel
    public static String[] findByLastName(final String lastName)
    Searches the array trying to find all names that has passed in last name.
    Returns a String array containing all matches.
    SUGGESTIONS:  */
    public static String[] findByLastName(final String lastName) {

        for (String na : names){
            if (fullName.equalsIgnoreCase(na))
                return na;}
        return "Name not found";
    }
    } //Should have a Return!

    /* Nivethitha
    public static boolean update(final String original, final String updatedName)
    Should find a name and replace it with new fullName if available.
    Returns true if name was found and updated with the new name.
    False if name could not be updated because name wasn’t found or name was found
    but an existing name matching the updatedName already exists.
    SUGGESTIONS:  */
    public static boolean update(final String original, final String updateName) {

    } //Should have a Return!

    /* Samuel
    public static boolean remove(final String fullName)
    Should remove a name from the array. Returns true if name was removed and false if the name was not
    removed for some reason.
    SUGGESTIONS:  */
    public static boolean remove(final String fullName) {

    } //Should have a Return!
}

    public static String findByLastName(final String lastName) {

        String splitNames[];
        for (String na : names) {
            splitNames = na.split(" ");

            if (splitNames.length >= 2 && splitNames[1].equalsIgnoreCase(lastName)) {
                System.out.println("Full Name: " + na);
                return na;
            }
        }
        return "NAME NOT FOUND";
    }

    public static String findByFirstName(final String lastName) {

        String splitNames[];
        for (String na : names) {
            splitNames = na.split(" ");

            if (splitNames.length >= 2 && splitNames[0].equalsIgnoreCase(lastName)) {
                System.out.println("Full Name: " + na);
                return na;
            }
        }
        return "NAME NOT FOUND";
    }


    public static boolean update(final String original, final String updatedName) {
           int index=0;
           boolean flag=false;
        for(int i=0;i< names.length;i++)
        {
            if(names[i].equals(updatedName)){
                index=i;
                flag=true;
            }
        }
        if(!flag){

            names=Arrays.copyOf(names,names.length+1);
            names[names.length-1]=updatedName;
            System.out.println("Updated array");
            System.out.println(Arrays.toString(names));
        }








        return false;
    }


}


