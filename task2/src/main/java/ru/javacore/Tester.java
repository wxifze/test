package ru.javacore;

import java.util.Random;

class Tester {
	String name;
	String surname;
	int expirienceInYears;
	String englishLevel;
	double salary;
	
	public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
		setName(name);
		setSurname(surname);
		setExpirienceInYears(expirienceInYears);
		setEnglishLevel(englishLevel);
		setSalary(salary);
	}

	public Tester(String name, String surname, int expirienceInYears,  double salary) {
		this(name, surname, expirienceInYears,"N/A", salary);
	}

	public Tester(String name, String surname, double salary) {
		this(name, surname, 0, salary);
	}

	public void setName(String name)	{
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}
	public int getExpirienceInYears() {
		return expirienceInYears;
	}
	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}
	public void setEnglishLevel(int englishLevel) {
		setEnglishLevel(Integer.toString(englishLevel));
	}
	public void setEnglishLevel(int englishLevelI, char englishLevelC) {
		setEnglishLevel(englishLevelC + Integer.toString(englishLevelI));
	}
	public String getEnglishLevel() {
		return englishLevel;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Tester: " + getName() + " " + getSurname() + ", " + getSalary() + "$, engish: " + getEnglishLevel() + ", expirience: " + getExpirienceInYears();
	}


	static Random rand = new Random();
	static Tester random() {
		return new Tester(randomString(10), randomString(10), rand.nextInt(10), Integer.toString(rand.nextInt(10)), rand.nextDouble() * 1000);
	}

	protected static String randomString(int n) {
		String result = "";
		for (int i = 0; i < n; i++)
			result += randomChar();
		return result;
	}

	protected static char randomChar() {
		return (char)('a' + rand.nextInt('z' - 'a'));
	}
}
