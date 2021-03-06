/*
 * Copyright (C) 2015 Andrea Binello ("andbin")
 *
 * This file is part of the "Java Examples" project and is licensed under the
 * MIT License. See one of the license files included in the root of the project
 * for the full text of the license.
 */

import java.util.ArrayList;
import java.util.List;

// A simple in-memory database of persons. Combinations of first name/last name/city
// are completely random.

public class PersonsDB {
	private static final Person[] persons = {
		new Person("Anne", "Allen", "Los Angeles"),
		new Person("Terry", "Bennett", "Washington"),
		new Person("Marie", "Anderson", "San Diego"),
		new Person("Nicole", "Thomas", "Washington"),
		new Person("Joseph", "Green", "Philadelphia"),
		new Person("Paula", "Hughes", "Los Angeles"),
		new Person("Irene", "Rivera", "New Orleans"),
		new Person("Jose", "Clark", "Miami"),
		new Person("Benjamin", "Cox", "Washington"),
		new Person("Albert", "Evans", "San Diego"),
		new Person("Jimmy", "Long", "Los Angeles"),
		new Person("Donald", "Kelly", "San Diego"),
		new Person("Elizabeth", "Diaz", "Cleveland"),
		new Person("Larry", "Gonzales", "New York"),
		new Person("Lori", "Rodriguez", "Las Vegas"),
		new Person("Kathleen", "Bailey", "Washington"),
		new Person("Paul", "Jackson", "San Francisco"),
		new Person("Thomas", "Peterson", "Atlanta"),
		new Person("Harry", "Parker", "Richmond"),
		new Person("Anthony", "Lee", "Dallas"),
		new Person("Amanda", "Gray", "Miami"),
		new Person("Carlos", "Sanders", "Cleveland"),
		new Person("Jacqueline", "Morgan", "New York"),
		new Person("Donna", "Simmons", "San Diego"),
		new Person("Phyllis", "Perez", "Los Angeles"),
		new Person("Keith", "Coleman", "Washington"),
		new Person("Bruce", "Bell", "Houston"),
		new Person("Rebecca", "Lopez", "Dallas"),
		new Person("Kelly", "Young", "Houston"),
		new Person("Anna", "Gonzalez", "Los Angeles"),
		new Person("Denise", "Jones", "Las Vegas"),
		new Person("Justin", "Williams", "San Francisco"),
		new Person("Clarence", "Scott", "New Orleans"),
		new Person("Ruth", "Flores", "Denver"),
		new Person("Todd", "Washington", "Washington"),
		new Person("Linda", "Rogers", "San Francisco"),
		new Person("Joan", "Cook", "Cleveland"),
		new Person("Melissa", "Stewart", "San Diego"),
		new Person("Jane", "Hernandez", "New York"),
		new Person("Alan", "Howard", "Dallas"),
		new Person("Kathryn", "Turner", "Richmond"),
		new Person("Eric", "Richardson", "Washington"),
		new Person("Eugene", "Foster", "Los Angeles"),
		new Person("Jason", "Griffin", "New Orleans"),
		new Person("Angela", "Johnson", "New York"),
		new Person("Amy", "Adams", "Las Vegas"),
		new Person("Susan", "Reed", "Los Angeles"),
		new Person("Betty", "Ross", "Cleveland"),
		new Person("Willie", "Brown", "Las Vegas"),
		new Person("Adam", "Carter", "Miami"),
		new Person("Sara", "Wilson", "New York"),
		new Person("Jesse", "Walker", "Houston"),
		new Person("Gloria", "James", "Washington"),
		new Person("Patrick", "Ward", "San Diego"),
		new Person("Stephen", "Lewis", "Richmond"),
		new Person("Mildred", "Henderson", "New York"),
		new Person("Jeremy", "Torres", "San Francisco"),
		new Person("Tammy", "Mitchell", "Dallas"),
		new Person("Janice", "Murphy", "Cleveland"),
		new Person("Virginia", "Campbell", "New Orleans"),
		new Person("Scott", "Perry", "Las Vegas"),
		new Person("Deborah", "Thompson", "Washington"),
		new Person("Julie", "Roberts", "Miami"),
		new Person("Barbara", "Butler", "Los Angeles"),
		new Person("Bobby", "Ramirez", "San Diego"),
		new Person("Jeffrey", "Bryant", "Houston"),
		new Person("Lois", "Collins", "San Francisco"),
		new Person("Annie", "Nelson", "Richmond"),
		new Person("Cynthia", "Jenkins", "San Diego"),
		new Person("Heather", "Watson", "Richmond"),
		new Person("Jerry", "Davis", "Las Vegas"),
		new Person("William", "Patterson", "Cleveland"),
		new Person("Aaron", "Martin", "Los Angeles"),
		new Person("Dorothy", "White", "Boston"),
		new Person("Roger", "Morris", "Miami"),
		new Person("Howard", "Taylor", "New York"),
		new Person("Robert", "Price", "San Francisco"),
		new Person("Ryan", "Sanchez", "New York"),
		new Person("Brenda", "Robinson", "Dallas"),
		new Person("Steven", "Alexander", "Washington"),
		new Person("Edward", "Wood", "Denver"),
		new Person("Sandra", "Hill", "Los Angeles"),
		new Person("John", "Brooks", "San Francisco"),
		new Person("Henry", "Wright", "Richmond"),
		new Person("Theresa", "Moore", "Las Vegas"),
		new Person("Gerald", "Baker", "San Diego"),
		new Person("Jennifer", "Hall", "Cleveland"),
		new Person("Tina", "Miller", "Houston"),
		new Person("Christina", "Smith", "Dallas"),
		new Person("Ruby", "Martinez", "Indianapolis"),
		new Person("Douglas", "Cooper", "Washington"),
		new Person("Alice", "Phillips", "Miami"),
		new Person("Sharon", "Garcia", "Cleveland"),
		new Person("Martin", "Russell", "Richmond"),
		new Person("Bonnie", "Harris", "Dallas"),
		new Person("Martha", "Barnes", "Boston"),
		new Person("Frank", "King", "Las Vegas"),
		new Person("Ann", "Powell", "San Diego"),
		new Person("Steve", "Edwards", "Miami"),
		new Person("Matthew", "King", "Washington"),
		new Person("Rachel", "Lewis", "Los Angeles"),
		new Person("Thomas", "Brooks", "San Diego"),
		new Person("Julia", "Flores", "San Francisco"),
		new Person("Joyce", "Hill", "Kansas City"),
		new Person("Andrew", "Foster", "Houston"),
		new Person("Ronald", "Adams", "Richmond"),
		new Person("Irene", "Carter", "New York"),
		new Person("Chris", "Davis", "San Diego"),
		new Person("Benjamin", "Perry", "Cleveland"),
		new Person("Phyllis", "Roberts", "Los Angeles"),
		new Person("Joshua", "Torres", "Las Vegas"),
		new Person("Beverly", "Scott", "Washington"),
		new Person("Rose", "Reed", "San Francisco"),
		new Person("Joe", "Allen", "Denver"),
		new Person("Lillian", "Howard", "Washington"),
		new Person("Carolyn", "Rodriguez", "Cleveland"),
		new Person("Walter", "Smith", "Los Angeles"),
		new Person("Jimmy", "Stewart", "Las Vegas"),
		new Person("Brandon", "Robinson", "Boston"),
		new Person("Karen", "Russell", "Philadelphia"),
		new Person("Patricia", "Gray", "Indianapolis"),
		new Person("Scott", "Phillips", "Dallas"),
		new Person("Mildred", "Thomas", "San Diego"),
		new Person("Paul", "Gonzalez", "Houston"),
		new Person("Lisa", "Green", "Washington"),
		new Person("Jacqueline", "Rogers", "Las Vegas"),
		new Person("Martha", "Watson", "Los Angeles"),
		new Person("Matthew", "Bell", "Richmond"),
		new Person("Janet", "Jones", "San Francisco"),
		new Person("Anna", "White", "Miami"),
		new Person("Catherine", "Rivera", "New York"),
		new Person("Anthony", "Ward", "Washington"),
		new Person("Carlos", "Cooper", "San Francisco"),
		new Person("Juan", "Kelly", "San Diego"),
		new Person("Clarence", "Moore", "Richmond"),
		new Person("Marie", "Bailey", "Dallas"),
		new Person("Sean", "Lopez", "San Francisco"),
		new Person("Lori", "Morris", "Boston"),
		new Person("Stephanie", "James", "Boston"),
		new Person("Raymond", "Cox", "Greenville"),
		new Person("Albert", "Anderson", "Los Angeles"),
		new Person("Earl", "Baker", "San Francisco"),
		new Person("Kenneth", "Peterson", "Miami"),
		new Person("Patrick", "Bryant", "Washington"),
		new Person("Ryan", "Edwards", "Indianapolis"),
		new Person("Jerry", "Campbell", "Richmond"),
		new Person("Annie", "Jenkins", "Kansas City"),
		new Person("Kimberly", "Clark", "Richmond"),
		new Person("Shawn", "Sanders", "New York"),
		new Person("Terry", "Walker", "Atlanta"),
		new Person("Ann", "Garcia", "Philadelphia"),
		new Person("Ruth", "Hall", "Miami"),
		new Person("Jose", "Henderson", "Las Vegas"),
		new Person("Kathleen", "Sanchez", "Houston"),
		new Person("Fred", "Evans", "Washington"),
		new Person("Bonnie", "Washington", "Cleveland"),
		new Person("Carol", "Long", "Los Angeles"),
		new Person("Evelyn", "Cook", "New Orleans"),
		new Person("Victor", "Wood", "San Francisco"),
		new Person("Jane", "Ramirez", "New York"),
		new Person("Laura", "Hernandez", "San Diego"),
		new Person("Bobby", "Wilson", "Richmond"),
		new Person("Johnny", "Thompson", "Las Vegas"),
		new Person("Louis", "Griffin", "Boston"),
		new Person("Jonathan", "Ross", "New York"),
		new Person("Carl", "Price", "San Diego"),
		new Person("Jean", "Johnson", "Houston"),
		new Person("Craig", "Richardson", "Boston"),
		new Person("Kathy", "Taylor", "San Diego"),
		new Person("Michelle", "Diaz", "Richmond"),
		new Person("Frank", "Lee", "Kansas City"),
		new Person("Norma", "Bennett", "Houston"),
		new Person("Philip", "Patterson", "Cleveland"),
		new Person("Steven", "Collins", "Las Vegas"),
		new Person("Sara", "Alexander", "Washington"),
		new Person("Julie", "Nelson", "Richmond"),
		new Person("Paula", "King", "Dallas"),
		new Person("Stephen", "Martinez", "Los Angeles"),
		new Person("Frances", "Simmons", "San Francisco"),
		new Person("Doris", "Powell", "Denver"),
		new Person("Russell", "Young", "Miami"),
		new Person("Teresa", "Brown", "New York"),
		new Person("Keith", "Jackson", "Atlanta"),
		new Person("Jessica", "Perez", "Richmond"),
		new Person("Alice", "Morgan", "Greensboro"),
		new Person("Charles", "Parker", "San Francisco"),
		new Person("Ruby", "Murphy", "Los Angeles"),
		new Person("Pamela", "Coleman", "San Diego"),
		new Person("Denise", "Hughes", "Houston"),
		new Person("Maria", "Williams", "New York"),
		new Person("Howard", "Turner", "Kansas City"),
		new Person("Shirley", "Martin", "Atlanta"),
		new Person("Amy", "Barnes", "Washington"),
		new Person("Sharon", "Butler", "Las Vegas"),
		new Person("Sarah", "Gonzales", "San Francisco"),
		new Person("Arthur", "Wright", "Houston"),
		new Person("Joan", "Harris", "Richmond"),
		new Person("Jennifer", "Miller", "Dallas"),
		new Person("Joseph", "Mitchell", "San Francisco"),
		new Person("Jerry", "Howard", "Boston"),
	};

	public static List<Person> getPersons() {
		List<Person> personsList = new ArrayList<Person>();

		for (Person p : persons) {
			personsList.add(p);
		}

		return personsList;
	}
}