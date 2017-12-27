package org.revo.task.Config;

import org.revo.task.Domain.*;
import org.revo.task.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class Data {
    @Autowired
    DepartmentsEntityRepository departmentsEntityRepository;
    @Autowired
    JobHistoryEntityRepository jobHistoryEntityRepository;
    @Autowired
    JobsEntityRepository jobsEntityRepository;
    @Autowired
    EmployeesEntityRepository employeesEntityRepository;
    @Autowired
    CountriesEntityRepository countriesEntityRepository;
    @Autowired
    LocationsEntityRepository locationsEntityRepository;
    @Autowired
    RegionsEntityRepository regionsEntityRepository;

    @PostConstruct
    public void init() {
        List<DepartmentsEntity> departmentsEntities = Arrays.asList(new DepartmentsEntity("10", "Administration", "198", "1700"),
                new DepartmentsEntity("20", "Marketing", "201", "1800"),
                new DepartmentsEntity("30", "Purchasing", "114", "1700"),
                new DepartmentsEntity("40", "Human\r\nResources", "203", "2400"),
                new DepartmentsEntity("50", "Shipping", "121", "1500"),
                new DepartmentsEntity("60", "IT", "103", "1400"),
                new DepartmentsEntity("70", "Public\r\nRelations", "204", "2700"),
                new DepartmentsEntity("80", "Sales", "145", "2500"),
                new DepartmentsEntity("90", "Executive", "100", "1700"),
                new DepartmentsEntity("100", "Finance", "108", "1700"),
                new DepartmentsEntity("110", "Accounting", "205", "1700"),
                new DepartmentsEntity("120", "Treasury", "0", "1700"),
                new DepartmentsEntity("130", "Corporate Tax", "0", "1700"),
                new DepartmentsEntity("140", "Control And Credit", "0", "1700"),
                new DepartmentsEntity("150", "Shareholder Services", "0", "1700"),
                new DepartmentsEntity("160", "Benefits", "0", "1700"),
                new DepartmentsEntity("170", "Manufacturing", "0", "1700"),
                new DepartmentsEntity("180", "Construction", "0", "1700"),
                new DepartmentsEntity("190", "Contracting", "0", "1700"),
                new DepartmentsEntity("200", "Operations", "0", "1700"),
                new DepartmentsEntity("210", "IT\r\nSupport", "0", "1700"),
                new DepartmentsEntity("220", "NOC", "0", "1700"),
                new DepartmentsEntity("230", "IT Helpdesk", "0", "1700"),
                new DepartmentsEntity("240", "Government Sales", "0", "1700"),
                new DepartmentsEntity("250", "Retail Sales", "0", "1700"),
                new DepartmentsEntity("260", "Recruiting", "0", "1700"),
                new DepartmentsEntity("270", "Payroll", "0", "1700"));
        departmentsEntityRepository.save(departmentsEntities);

        List<EmployeesEntity> employeesEntities = Arrays.asList(new EmployeesEntity("100", "Steven", "King", "SKING", "515.123.4567", "1987-06-19", "AD_PRES", "24000.00", "0.00", "0", "90", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("101", "Neena", "Kochhar", "NKOCHHAR", "515.123.4568", "1987-06-19", "AD_VP", "17000.00", "0.00", "100", "90", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("102", "Lex", "De\r\nHaan", "LDEHAAN", "515.123.4569", "1987-06-19", "AD_VP", "17000.00", "0.00", "100", "90", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("103", "Alexander", "Hunold", "AHUNOLD", "590.423.4567", "1987-06-19", "IT_PROG", "9000.00", "0.00", "102", "60", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("104", "Bruce", "Ernst", "BERNST", "590.423.4568", "1987-06-19", "IT_PROG", "6000.00", "0.00", "103", "60", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("105", "David", "Austin", "DAUSTIN", "590.423.4569", "1987-06-19", "IT_PROG", "4800.00", "0.00", "103", "60", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("106", "ValliQ", "PataballaQ", "VPATABALQ", "590.423.4560", "1987-06-18", "IT_PROG", "4500.00", "0.20", "103", "60", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("107", "Diana", "Lorentz", "DLORENTZ", "590.423.5567", "1987-06-19", "IT_PROG", "4200.00", "0.00", "103", "60", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("108", "Nancy", "Greenberg", "NGREENBE", "515.124.4569", "1987-06-19", "FI_MGR", "12000.00", "0.00", "101", "100", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("109", "Daniel", "Faviet", "DFAVIET", "515.124.4169", "1987-06-19", "FI_ACCOUNT", "9000.00", "0.00", "108", "100", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("110", "John", "Chen", "JCHEN", "515.124.4269", "1987-06-19", "FI_ACCOUNT", "8200.00", "0.00", "108", "100", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("111", "Ismael", "Sciarra", "ISCIARRA", "515.124.4369", "1987-06-19", "FI_ACCOUNT", "7700.00", "0.00", "108", "100", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("112", "Jose\r\nManuel", "Urman", "JMURMAN", "515.124.4469", "1987-06-19", "FI_ACCOUNT", "7800.00", "0.00", "108", "100", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("113", "Luis", "Popp", "LPOPP", "515.124.4567", "1987-06-19", "FI_ACCOUNT", "6900.00", "0.00", "108", "100", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("114", "Den", "Raphaely", "DRAPHEAL", "515.127.4561", "1987-06-19", "PU_MAN", "11000.00", "0.00", "100", "30", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("115", "Alexander", "Khoo", "AKHOO", "515.127.4562", "1987-06-19", "PU_CLERK", "3100.00", "0.00", "114", "30", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("116", "Shelli", "Baida", "SBAIDA", "515.127.4563", "1987-06-19", "PU_CLERK", "2900.00", "0.00", "114", "30", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("117", "Sigal", "Tobias", "STOBIAS", "515.127.4564", "1987-06-19", "PU_CLERK", "2800.00", "0.00", "114", "30", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("118", "Guy", "Himuro", "GHIMURO", "515.127.4565", "1987-06-19", "PU_CLERK", "2600.00", "0.00", "114", "30", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("119", "Karen", "Colmenares", "KCOLMENA", "515.127.4566", "1987-06-19", "PU_CLERK", "2500.00", "0.00", "114", "30", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("120", "Matthew", "Weiss", "MWEISS", "650.123.1234", "1987-06-19", "ST_MAN", "8000.00", "0.00", "100", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("121", "Adam", "Fripp", "AFRIPP", "650.123.2234", "1987-06-19", "ST_MAN", "8200.00", "0.00", "100", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("122", "Payam", "Kaufling", "PKAUFLIN", "650.123.3234", "1987-06-19", "ST_MAN", "7900.00", "0.00", "100", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("123", "Shanta", "Vollman", "SVOLLMAN", "650.123.4234", "1987-06-19", "ST_MAN", "6500.00", "0.00", "100", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("124", "Kevin", "Mourgos", "KMOURGOS", "650.123.5234", "1987-06-19", "ST_MAN", "5800.00", "0.00", "100", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("125", "Julia", "Nayer", "JNAYER", "650.124.1214", "1987-06-19", "ST_CLERK", "3200.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("126", "Irene", "Mikkilineni", "IMIKKILI", "650.124.1224", "1987-06-19", "ST_CLERK", "2700.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("127", "James", "Landry", "JLANDRY", "650.124.1334", "1987-06-19", "ST_CLERK", "2400.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("128", "Steven", "Markle", "SMARKLE", "650.124.1434", "1987-06-19", "ST_CLERK", "2200.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("129", "Laura", "Bissot", "LBISSOT", "650.124.5234", "1987-06-19", "ST_CLERK", "3300.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("130", "Mozhe", "Atkinson", "MATKINSO", "650.124.6234", "1987-06-19", "ST_CLERK", "2800.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("131", "James", "Marlow", "JAMRLOW", "650.124.7234", "1987-06-19", "ST_CLERK", "2500.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("132", "TJ", "Olson", "TJOLSON", "650.124.8234", "1987-06-19", "ST_CLERK", "2100.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("133", "Jason", "Mallin", "JMALLIN", "650.127.1934", "1987-06-19", "ST_CLERK", "3300.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("134", "Michael", "Rogers", "MROGERS", "650.127.1834", "1987-06-19", "ST_CLERK", "2900.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("135", "Ki", "Gee", "KGEE", "650.127.1734", "1987-06-19", "ST_CLERK", "2400.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("136", "Hazel", "Philtanker", "HPHILTAN", "650.127.1634", "1987-06-19", "ST_CLERK", "2200.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("137", "Renske", "Ladwig", "RLADWIG", "650.121.1234", "1987-06-19", "ST_CLERK", "3600.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("138", "Stephen", "Stiles", "SSTILES", "650.121.2034", "1987-06-19", "ST_CLERK", "3200.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("139", "John", "Seo", "JSEO", "650.121.2019", "1987-06-19", "ST_CLERK", "2700.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("140", "Joshua", "Patel", "JPATEL", "650.121.1834", "1987-06-19", "ST_CLERK", "2500.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("141", "Trenna", "Rajs", "TRAJS", "650.121.8009", "1987-06-19", "ST_CLERK", "3500.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("142", "Curtis", "Davies", "CDAVIES", "650.121.2994", "1987-06-19", "ST_CLERK", "3100.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("143", "Randall", "Matos", "RMATOS", "650.121.2874", "1987-06-19", "ST_CLERK", "2600.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("144", "Peter", "Vargas", "PVARGAS", "650.121.2004", "1987-06-19", "ST_CLERK", "2500.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("145", "John", "Russell", "JRUSSEL", "011.44.1344.429268", "1987-06-19", "SA_MAN", "14000.00", "0.40", "100", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("146", "Karen", "Partners", "KPARTNER", "011.44.1344.467268", "1987-06-19", "SA_MAN", "13500.00", "0.30", "100", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("147", "Alberto", "Errazuriz", "AERRAZUR", "011.44.1344.429278", "1987-06-19", "SA_MAN", "12000.00", "0.30", "100", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("148", "Gerald", "Cambrault", "GCAMBRAU", "011.44.1344.619268", "1987-06-19", "SA_MAN", "11000.00", "0.30", "100", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("149", "Eleni", "Zlotkey", "EZLOTKEY", "011.44.1344.429018", "1987-06-19", "SA_MAN", "10500.00", "0.20", "100", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("150", "Peter", "Tucker", "PTUCKER", "011.44.1344.129268", "1987-06-19", "SA_REP", "10000.00", "0.30", "145", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("151", "David", "Bernstein", "DBERNSTE", "011.44.1344.345268", "1987-06-19", "SA_REP", "9500.00", "0.25", "145", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("152", "Peter", "Hall", "PHALL", "011.44.1344.478968", "1987-06-19", "SA_REP", "9000.00", "0.25", "145", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("153", "Christopher", "Olsen", "COLSEN", "011.44.1344.498718", "1987-06-19", "SA_REP", "8000.00", "0.20", "145", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("154", "Nanette", "Cambrault", "NCAMBRAU", "011.44.1344.987668", "1987-06-19", "SA_REP", "7500.00", "0.20", "145", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("155", "Oliver", "Tuvault", "OTUVAULT", "011.44.1344.486508", "1987-06-19", "SA_REP", "7000.00", "0.15", "145", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("156", "Janette", "King", "JKING", "011.44.1345.429268", "1987-06-19", "SA_REP", "10000.00", "0.35", "146", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("157", "Patrick", "Sully", "PSULLY", "011.44.1345.929268", "1987-06-19", "SA_REP", "9500.00", "0.35", "146", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("158", "Allan", "McEwen", "AMCEWEN", "011.44.1345.829268", "1987-06-19", "SA_REP", "9000.00", "0.35", "146", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("159", "Lindsey", "Smith", "LSMITH", "011.44.1345.729268", "1987-06-19", "SA_REP", "8000.00", "0.30", "146", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("160", "Louise", "Doran", "LDORAN", "011.44.1345.629268", "1987-06-19", "SA_REP", "7500.00", "0.30", "146", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("161", "Sarath", "Sewall", "SSEWALL", "011.44.1345.529268", "1987-06-19", "SA_REP", "7000.00", "0.25", "146", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("162", "Clara", "Vishney", "CVISHNEY", "011.44.1346.129268", "1987-06-19", "SA_REP", "10500.00", "0.25", "147", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("163", "Danielle", "Greene", "DGREENE", "011.44.1346.229268", "1987-06-19", "SA_REP", "9500.00", "0.15", "147", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("164", "Mattea", "Marvins", "MMARVINS", "011.44.1346.329268", "1987-06-19", "SA_REP", "7200.00", "0.10", "147", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("165", "David", "Lee", "DLEE", "011.44.1346.529268", "1987-06-19", "SA_REP", "6800.00", "0.10", "147", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("166", "Sundar", "Ande", "SANDE", "011.44.1346.629268", "1987-06-19", "SA_REP", "6400.00", "0.10", "147", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("167", "Amit", "Banda", "ABANDA", "011.44.1346.729268", "1987-06-19", "SA_REP", "6200.00", "0.10", "147", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("168", "Lisa", "Ozer", "LOZER", "011.44.1343.929268", "1987-06-19", "SA_REP", "11500.00", "0.25", "148", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("169", "Harrison", "Bloom", "HBLOOM", "011.44.1343.829268", "1987-06-19", "SA_REP", "10000.00", "0.20", "148", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("170", "Tayler", "Fox", "TFOX", "011.44.1343.729268", "1987-06-19", "SA_REP", "9600.00", "0.20", "148", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("171", "William", "Smith", "WSMITH", "011.44.1343.629268", "1987-06-19", "SA_REP", "7400.00", "0.15", "148", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("172", "Elizabeth", "Bates", "EBATES", "011.44.1343.529268", "1987-06-19", "SA_REP", "7300.00", "0.15", "148", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("173", "Sundita", "Kumar", "SKUMAR", "011.44.1343.329268", "1987-06-19", "SA_REP", "6100.00", "0.10", "148", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("174", "Ellen", "Abel", "EABEL", "011.44.1644.429267", "1987-06-19", "SA_REP", "11000.00", "0.30", "149", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("175", "Alyssa", "Hutton", "AHUTTON", "011.44.1644.429266", "1987-06-19", "SA_REP", "8800.00", "0.25", "149", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("176", "Jonathon", "Taylor", "JTAYLOR", "011.44.1644.429265", "1987-06-19", "SA_REP", "8600.00", "0.20", "149", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("177", "Jack", "Livingston", "JLIVINGS", "011.44.1644.429264", "1987-06-19", "SA_REP", "8400.00", "0.20", "149", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("178", "Kimberely", "Grant", "KGRANT", "011.44.1644.429263", "1987-06-19", "SA_REP", "7000.00", "0.15", "149", "0", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("179", "Charles", "Johnson", "CJOHNSON", "011.44.1644.429262", "1987-06-19", "SA_REP", "6200.00", "0.10", "149", "80", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("180", "Winston", "Taylor", "WTAYLOR", "650.507.9876", "1987-06-19", "SH_CLERK", "3200.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("181", "Jean", "Fleaur", "JFLEAUR", "650.507.9877", "1987-06-19", "SH_CLERK", "3100.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("182", "Martha", "Sullivan", "MSULLIVA", "650.507.9878", "1987-06-19", "SH_CLERK", "2500.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("183", "Girard", "Geoni", "GGEONI", "650.507.9879", "1987-06-19", "SH_CLERK", "2800.00", "0.00", "120", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("184", "Nandita", "Sarchand", "NSARCHAN", "650.509.1876", "1987-06-19", "SH_CLERK", "4200.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("185", "Alexis", "Bull", "ABULL", "650.509.2876", "1987-06-19", "SH_CLERK", "4100.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("186", "Julia", "Dellinger", "JDELLING", "650.509.3876", "1987-06-19", "SH_CLERK", "3400.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("187", "Anthony", "Cabrio", "ACABRIO", "650.509.4876", "1987-06-19", "SH_CLERK", "3000.00", "0.00", "121", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("188", "Kelly", "Chung", "KCHUNG", "650.505.1876", "1987-06-19", "SH_CLERK", "3800.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("189", "Jennifer", "Dilly", "JDILLY", "650.505.2876", "1987-06-19", "SH_CLERK", "3600.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("190", "Timothy", "Gates", "TGATES", "650.505.3876", "1987-06-19", "SH_CLERK", "2900.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("191", "Randall", "Perkins", "RPERKINS", "650.505.4876", "1987-06-19", "SH_CLERK", "2500.00", "0.00", "122", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("192", "Sarah", "Bell", "SBELL", "650.501.1876", "1987-06-19", "SH_CLERK", "4000.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("193", "Britney", "Everett", "BEVERETT", "650.501.2876", "1987-06-19", "SH_CLERK", "3900.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("194", "Samuel", "McCain", "SMCCAIN", "650.501.3876", "1987-06-19", "SH_CLERK", "3200.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("195", "Vance", "Jones", "VJONES", "650.501.4876", "1987-06-19", "SH_CLERK", "2800.00", "0.00", "123", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("196", "Alana", "Walsh", "AWALSH", "650.507.9811", "1987-06-19", "SH_CLERK", "3100.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("197", "Kevin", "Feeney", "KFEENEY", "650.507.9822", "1987-06-19", "SH_CLERK", "3000.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("198", "Donald", "OConnell", "DOCONNEL", "650.507.9833", "1987-06-19", "SH_CLERK", "2600.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("199", "Douglas", "Grant", "DGRANT", "650.507.9844", "1987-06-19", "SH_CLERK", "2600.00", "0.00", "124", "50", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("200", "Jennifer", "Whalen", "JWHALEN", "515.123.4444", "1987-06-19", "AD_ASST", "4400.00", "0.00", "101", "10", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("201", "Michael", "Hartstein", "MHARTSTE", "515.123.5555", "1987-06-19", "MK_MAN", "13000.00", "0.00", "100", "20", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("202", "Pat", "Fay", "PFAY", "603.123.6666", "1987-06-19", "MK_REP", "6000.00", "0.00", "201", "20", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("203", "Susan", "Mavris", "SMAVRIS", "515.123.7777", "1987-06-19", "HR_REP", "6500.00", "0.00", "101", "40", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("204", "Hermann", "Baer", "HBAER", "515.123.8888", "1987-06-19", "PR_REP", "10000.00", "0.00", "101", "70", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("205", "Shelley", "Higgins", "SHIGGINS", "515.123.8080", "1987-06-19", "AC_MGR", "12000.00", "0.00", "101", "110", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"),
                new EmployeesEntity("206", "William", "Gietz", "WGIETZ", "515.123.8181", "1987-06-19", "AC_ACCOUNT", "8300.00", "0.00", "205", "110", "$2a$10$aZWQW60AlJRE1w7iiibbgu0PqzEs0AYNFLH4TGVYKgfXHYELQt7RS"));
        employeesEntityRepository.save(employeesEntities);

        List<CountriesEntity> countriesEntities = Arrays.asList(
                new CountriesEntity("AR", "Argentina", "2"),
                new CountriesEntity("AU", "Australia", "3"),
                new CountriesEntity("BE", "Belgium", "1"),
                new CountriesEntity("BR", "Brazil", "2"),
                new CountriesEntity("CA", "Canada", "2"),
                new CountriesEntity("CH", "Switzerland", "1"),
                new CountriesEntity("CN", "China", "3"),
                new CountriesEntity("DE", "Germany", "1"),
                new CountriesEntity("DK", "Denmark", "1"),
                new CountriesEntity("EG", "Egypt", "4"),
                new CountriesEntity("FR", "France", "1"),
                new CountriesEntity("HK", "HongKong", "3"),
                new CountriesEntity("IL", "Israel", "4"),
                new CountriesEntity("IN", "India", "3"),
                new CountriesEntity("IT", "Italy", "1"),
                new CountriesEntity("JP", "Japan", "3"),
                new CountriesEntity("KW", "Kuwait", "4"),
                new CountriesEntity("MX", "Mexico", "2"),
                new CountriesEntity("NG", "Nigeria", "4"),
                new CountriesEntity("NL", "Netherlands", "1"),
                new CountriesEntity("SG", "Singapore", "3"),
                new CountriesEntity("UK", "United Kingdom", "1"),
                new CountriesEntity("US", "United States of America", "2"),
                new CountriesEntity("ZM", "Zambia", "4"),
                new CountriesEntity("ZW", "Zimbabwe", "4"));
        countriesEntityRepository.save(countriesEntities);

        List<JobsEntity> jobsEntities = Arrays.asList(
                new JobsEntity("AC_ACCOUNT", "Public Accountant", "4200", "9000"),
                new JobsEntity("AC_MGR", "Accounting Manager", "8200", "16000"),
                new JobsEntity("AD_ASST", "Administration\r\nAssistant", "3000", "6000"),
                new JobsEntity("AD_PRES", "President", "20000", "40000"),
                new JobsEntity("AD_VP", "Administration Vice President", "15000", "30000"),
                new JobsEntity("FI_ACCOUNT", "Accountant", "4200", "9000"),

                new JobsEntity("FI_MGR", "Finance\r\nManager", "8200", "16000"),

                new JobsEntity("HR_REP", "Human Resources Representative", "4000", "9000"),
                new JobsEntity("IT_PROG", "Programmer", "4000", "10000"),
                new JobsEntity("MK_MAN", "Marketing\r\nManager", "9000", "15000"),
                new JobsEntity("MK_REP", "Marketing Representative", "4000", "9000"),
                new JobsEntity("PR_REP", "Public Relations Representative", "4500", "10500"),
                new JobsEntity("PU_CLERK", "Purchasing Clerk", "2500", "5500"),
                new JobsEntity("PU_MAN", "Purchasing\r\nManager", "8000", "15000"),
                new JobsEntity("SA_MAN", "Sales Manager", "10000", "20000"),
                new JobsEntity("SA_REP", "Sales\r\nRepresentative", "6000", "12000"),
                new JobsEntity("SH_CLERK", "Shipping Clerk", "2500", "5500"),
                new JobsEntity("ST_CLERK", "Stock Clerk", "2000", "5000"),
                new JobsEntity("ST_MAN", "Stock Manager", "5500", "8500"));

        jobsEntityRepository.save(jobsEntities);

        List<JobHistoryEntity> jobHistoryEntities = Arrays.asList(new JobHistoryEntity("101", "1989-09-21", "1993-06-17", "AC_ACCOUNT", "110"),
                new JobHistoryEntity("101", "1993-10-28", "1997-03-15", "AC_MGR", "110"),
                new JobHistoryEntity("102", "1993-01-13", "1998-07-24", "IT_PROG", "60"),
                new JobHistoryEntity("114", "1998-03-24", "1993-06-18", "AC_ACCOUNT", "200"),
                new JobHistoryEntity("122", "1999-01-01", "1999-12-31", "ST_CLERK", "50"),
                new JobHistoryEntity("176", "1998-03-01", "1998-12-31", "SA_REP", "80"),
                new JobHistoryEntity("176", "1999-01-01", "1999-12-31", "SA_MAN", "80"),
                new JobHistoryEntity("200", "1987-09-17", "1993-06-17", "AD_ASST", "90"),
                new JobHistoryEntity("200", "1994-07-01", "1993-06-17", "AC_ACCOUNT", "90"),
                new JobHistoryEntity("201", "1996-02-17", "1999-12-19", "MK_REP", "20"));

        jobHistoryEntityRepository.save(jobHistoryEntities);

        List<RegionsEntity> regions = Arrays.asList(
                new RegionsEntity("2", "Americas"),
                new RegionsEntity("3", "Asia\r"),
                new RegionsEntity("1", "Europe\r"),
                new RegionsEntity("4", "Middle East and Africa\r"));
        regionsEntityRepository.save(regions);

        List<LocationsEntity> locationsEntities = Arrays.asList(
                new LocationsEntity("1000", "1297 Via Cola diRie", "989", "Roma", "Itly", "IT"),
                new LocationsEntity("1100", "93091 Calle della\r\nTesta", "10934", "Venice", "", "IT"),
                new LocationsEntity("1200", "2017 Shinjuku-\r\nku", "1689", "Tokyo", "Tokyo Prefecture", "JP"),
                new LocationsEntity("1300", "9450 Kamiya-\r\ncho", "6823", "Hiroshima", "", "JP"),
                new LocationsEntity("1400", "2014 Jabberwocky\r\nRd", "26192", "Southlake", "Texas", "US"),
                new LocationsEntity("1500", "2011 Interiors\r\nBlvd", "99236", "South San Francisco", "California", "US"),
                new LocationsEntity("1600", "2007 Zagora\r\nSt", "50090", "South Brunswick", "New Jersey", "US"),
                new LocationsEntity("1700", "2004 Charade\r\nRd", "98199", "Seattle", "Washington", "US"),
                new LocationsEntity("1800", "147 Spadina Ave", "M5V\r\n2L7", "Toronto", "Ontario", "CA"),
                new LocationsEntity("1900", "6092 Boxwood St", "YSW\r\n9T2", "Whitehorse", "Yukon", "CA"),
                new LocationsEntity("2000", "40-5-12\r\nLaogianggen", "190518", "Beijing", "", "CN"),
                new LocationsEntity("2100", "1298 Vileparle\r\n(E)", "490231", "Bombay", "Maharashtra", "IN"),
                new LocationsEntity("2200", "12-98 Victoria\r\nStreet", "2901", "Sydney", "New South Wales", "AU"),
                new LocationsEntity("2300", "198 Clementi\r\nNorth", "540198", "Singapore", "", "SG"),
                new LocationsEntity("2400", "8204 Arthur\r\nSt", "", "London", "", "UK"),
                new LocationsEntity("2500", "\"Magdalen Centre", " The Oxford ", "OX9\r\n9ZB", "Oxford", "UK"),
                new LocationsEntity("2600", "9702 Chester\r\nRoad", "9629850293", "Stretford", "Manchester", "UK"),
                new LocationsEntity("2700", "Schwanthalerstr.\r\n7031", "80925", "Munich", "Bavaria", "DE"),
                new LocationsEntity("2800", "Rua Frei Caneca 1360", "01307-\r\n002", "Sao Paulo", "Sao Paulo", "BR"),
                new LocationsEntity("2900", "20 Rue des Corps-\r\nSaints", "1730", "Geneva", "Geneve", "CH"),
                new LocationsEntity("3000", "Murtenstrasse\r\n921", "3095", "Bern", "BE", "CH"),
                new LocationsEntity("3100", "Pieter Breughelstraat\r\n837", "3029SK", "Utrecht", "Utrecht", "NL"),
                new LocationsEntity("3200", "Mariano Escobedo\r\n9991", "11932", "Mexico City", "\"Distrito Federal", "MX"));

        locationsEntityRepository.save(locationsEntities);

    }
}
