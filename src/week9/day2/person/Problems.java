package week9.day2.person;

import week9.day2.person.Person;
import week9.day2.person.PersonComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problems {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(4);
        integers.add(5);
        //System.out.println(computeSum(integers));

        List<String> list = Arrays.asList("aca", "aba", "acccaa");
        //System.out.println(toUpperCase(list));
        //System.out.println(lessThanFour(list));
        List<String> list2 = Arrays.asList("aca", "aba", "acaa");
        List<List<String>> list3 = Arrays.asList(list, list2);
        //System.out.println(flat(list3));

        List<Person> personList = Arrays.asList(new Person("John", 22),
                new Person("Tom", 20), new Person("James", 2));

        //System.out.println(getOldestPerson(personList));
        //System.out.println(getOldestPersonVersionTwo(personList, new PersonComparator()));
        //System.out.println(getKids(personList));

        List<Person> personList1 = Arrays.asList(new Person("John", "USA"),
                new Person("Tom", "JAPAN"),
                new Person("James", "USA"));
        //System.out.println(groupByNationality(personList1, "USA"));
        //System.out.println(peopleNames(personList));



    }

    public static List<String> toUpperCase(List<String> list) {
        Stream<String> stringStream = list.stream().map(str -> str.toUpperCase());
        return stringStream.collect(Collectors.toList());
    }

    public static List<String> lessThanFour(List<String> list) {
        Stream<String> stringStream = list.stream().filter(str -> str.length() < 4);
        return stringStream.collect(Collectors.toList());
    }

    public static List<String> flat(List<List<String>> list) {
        return list.stream().flatMap(str -> str.stream()).collect(Collectors.toList());
    }

    public static Person getOldestPerson(List<Person> persons) {
        Optional<Person> reduce = persons.stream().reduce((person1, person2) ->
                person1.getAge() > person2.getAge() ? person1 : person2);
        return reduce.orElse(null);
    }

    public static Person getOldestPersonVersionTwo(List<Person> persons, PersonComparator comparator) {
        return persons.stream().max(comparator).orElse(null);
    }

    public static Integer computeSum(List<Integer> arr) {
        Optional<Integer> reduce = arr.stream().
                reduce((integer1, integer2) -> integer1 + integer2);
        return reduce.orElse(null);
    }

    public static List<Person> getKids(List<Person> list) {
        return list.stream().filter(person -> person.getAge() < 18)
                .collect(Collectors.toList());
    }

    public static List<Person> getAdults(List<Person> list) {
        return list.stream().filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public static Map<Boolean, List<Person>> PartitionAdultsAndKids(List<Person> list) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, getAdults(list));
        map.put(false, getKids(list));
        return map;
    }

    public static List<Person> groupByNationality(List<Person> list, String nationality) {
        Map<String, List<Person>> map = list.stream().collect(Collectors.groupingBy(person -> person.getNationality()));
        return map.get(nationality);
    }

    public static String peopleNames(List<Person> list) {
        return list.stream().map(person -> person.getName()).collect(Collectors.joining(","));
    }

}
