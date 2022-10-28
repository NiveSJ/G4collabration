package se.lexicon;


import java.util.Arrays;
public class NameRepository {


    private static String names[] = new String[0];

    public static int getSize() {

        int len = names.length;
        return len;
    }

    public static void setNames(String[] names) {
        NameRepository.names = arrayConcat(NameRepository.names, names);

    }

    public static String[] arrayConcat(String[] source, String[] elementsToAdd) {
        String[] combined = Arrays.copyOf(source, source.length + elementsToAdd.length);
        for (int i = source.length, j = 0; i < combined.length; i++, j++) {
            combined[i] = elementsToAdd[j];
        }
        return combined;
    }


    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        String[] result = Arrays.copyOf(names, names.length);
        return result;
    }

    public static String find(final String fullName) {
        for (String na : names) {
            if (fullName.equalsIgnoreCase(na))
                return na;
        }
        return "Name not found";
    }

    public static boolean add(final String fullName) {
        boolean flag = true;
        for (String name : names) {
            if (name.equals(fullName)) {
                flag = false;
                System.out.println("Name found cannot add");
            }
        }
        if (flag) {
            String newArray[] = Arrays.copyOf(names, names.length + 1);
            newArray[newArray.length - 1] = fullName;
            System.out.println(Arrays.toString(newArray));

            return true;
        }

        return false;
    }

    public static String[] findByLastName(final String lastName) {

        String newArray[] = new String[0];
        for (String elementArray : names) {
            String[] splitNames = elementArray.split(" ");
            if (splitNames.length == 2 && splitNames[1].equalsIgnoreCase(lastName)) {

                String tmp[] = Arrays.copyOf(newArray, newArray.length + 1);
                tmp[tmp.length - 1] = elementArray;
                newArray = tmp;
            }
        }
        return newArray;
    }


    public static String[] findByFirstname(final String firstName) {
        String newArray[] = new String[0];
        for (String elementArray : names) {
            String[] splitNames = elementArray.split(" ");
            if (splitNames.length == 2 && splitNames[0].equalsIgnoreCase(firstName)) {

                String tmp[] = Arrays.copyOf(newArray, newArray.length + 1);
                tmp[tmp.length - 1] = elementArray;
                newArray = tmp;
            }
        }
        return newArray;
    }


    public static boolean remove(final String fullName) {

        boolean flag = false;
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (fullName.equals(names[i])) {
                flag = true;
                index = i;
            }
        }
        if (flag) {
            names[index] = " ";
            System.out.println("Name removed");
        }
        for (String na : names) {
            if (na.equals(" ")) {
                continue;
            }
            System.out.println(na);
        }
        return true;

    }

    public static boolean update(final String original, final String updatedName) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(updatedName)) {

                flag = true;
                System.out.println("Name Cannot update");
                return false;
            }
        }
        if (!flag) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(original)) {

                    names[i] = updatedName;

                    System.out.println("Updated array:" + Arrays.toString(names));
                } else
                    System.out.println("Name Not found to update");


            }


        }


        return true;
    }


}


