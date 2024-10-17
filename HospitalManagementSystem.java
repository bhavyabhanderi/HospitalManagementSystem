import java.util.*;

class staff
{
    String sid, sname, desg, sex;
    int salary;
	
	// Helper method to check if a staff with the given ID already exists
    boolean isStaffIdExists(String newId, int count6, staff[] s) {
        for (int i = 0; i < count6; i++) {
            if (s[i].sid.equals(newId)) {
                return true; // ID already exists
            }
        }
        return false; // ID does not exist
    }
	
    void new_staff(staff[] s, int count6)
    {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the following details of staff: ");
		System.out.println();
        System.out.print("id:-");
        sid = input.nextLine();
		
		// Check if the new ID already exists
        while (isStaffIdExists(sid, count6, s)) {
            System.out.println("Staff with ID " + sid + " already exists. Please enter a different ID.");
            System.out.print("id:-");
            sid = input.nextLine();
        }
		
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    void staff_info()
    {
		System.out.printf("  %-8s %-20s %-20s %-20s %-20s\n", sid, sname, desg, sex, salary);
    }
}
class doctor
{
    String did, dname, specilist, appoint, doc_qual, dcontact;
    int droom;
	
	// Helper method to check if a doctor with the given ID already exists
    public boolean isDoctorIdExists(String newId, int count1, doctor[] d) {
        for (int i = 0; i < count1; i++) {
            if (d[i].did.equals(newId)) {
                return true; // ID already exists
            }
        }
        return false; // ID does not exist
    }
	
    void new_doctor(doctor[] d, int count1)
    {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the following details of doctors: ");
		System.out.println();
        System.out.print("id:-");
        did = input.nextLine();
		
		// Check if the new ID already exists
        while (isDoctorIdExists(did, count1, d)) {
            System.out.println("Doctor with ID " + did + " already exists. Please enter a different ID.");
            System.out.print("id:-");
            did = input.nextLine();
        }
		
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
		input.nextLine();
		System.out.print("contact no.:-");
        dcontact = input.nextLine();
    }
    void doctor_info()
    {
		System.out.printf("%-6s %-20s %-20s %-20s %-25s %-15s %-20s\n", did, dname, specilist, appoint, doc_qual, droom, dcontact);
    }
}
class patient
{
    String pid, pname, disease, sex, admit_status;
    int age;
	
	// Helper method to check if a patient with the given ID already exists
    public boolean isPatientIdExists(String newId, int count2, patient[] p) {
        for (int i = 0; i < count2; i++) {
            if (p[i].pid.equals(newId)) {
                return true; // ID already exists
            }
        }
        return false; // ID does not exist
    }
	
    void new_patient(patient[] p, int count2)
    {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the following details of patient:");
		System.out.println();
        System.out.print("id:-");
        pid = input.nextLine();
		
		// Check if the new ID already exists
        while (isPatientIdExists(pid, count2, p)) {
            System.out.println("Patient with ID " + pid + " already exists. Please enter a different ID.");
			System.out.println();
            System.out.print("id:-");
            pid = input.nextLine();
        }
		
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status(y or n):-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    void patient_info()
    {
        System.out.printf("%-10s %-20s %-22s %-22s %-20s %-20s\n", pid, pname, disease, sex, admit_status, age);
    }
}
class medical
{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the following deatils of medicine:");
		System.out.println();
        System.out.print("name:-");
        med_name = input.nextLine();
        System.out.print("comp:-");
        med_comp = input.nextLine();
        System.out.print("exp_date:-");
        exp_date = input.nextLine();
        System.out.print("cost:-");
        med_cost = input.nextInt();
    }
    void find_medi()
    {
        System.out.printf("  %-20s %-25s %-25s %-25s\n", med_name, med_comp, exp_date, med_cost);
    }
}
class lab
{
    String facility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the following deatils of laboratory:");
		System.out.println();
        System.out.print("laboratory name:-");
        facility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
    void faci_list()
    {
        System.out.printf("  %-40s %-25s\n", facility, lab_cost);
    }
}
class facility 
{
    String fac_name;
	int fac_No;
	
    void add_faci()
    {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the following deatils of facility:");
		System.out.println();
        System.out.print("facility:-");
        fac_name = input.nextLine();
		System.out.print("Helpline No:-");
        fac_No = input.nextInt();
    }
    void show_faci()
    {
        System.out.printf("  %-40s %-20s\n", fac_name, fac_No);
    }
}
class Main
{
    public static void main(String args[])
    {
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 6;
        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.println("                  *** Welcome to Hospital Management System ***");
        System.out.println("----------------------------------------------------------------------------------");
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        facility[] f = new facility[20];
        medical[] m = new medical[100];
        staff[] s = new staff[100];
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new facility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
        for (i = 0; i < 100; i++)
            s[i] = new staff();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS";
        d[0].droom = 17;
		d[0].dcontact = "210-845714977";
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MD";
        d[1].droom = 45;
		d[1].dcontact = "210-845498977";
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
		d[2].dcontact = "210-845717487";
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MS";
        d[3].droom = 40;
		d[3].dcontact = "210-479714977";

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].facility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fac_name = "Ambulance";
		f[0].fac_No = 108;
        f[1].fac_name = "Admit Facility";
		f[1].fac_No = 1599;
        f[2].fac_name = "Canteen";
		f[2].fac_No = 1022;
        f[3].fac_name = "Emergency";
		f[3].fac_No = 110;

        s[0].sid = "22";
        s[0].sname = "Prakash";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[1].sid = "23";
        s[1].sname = "Komal";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[3].sid = "25";
        s[3].sname = "Mansi";
        s[3].desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
		s[4].sid = "26";
        s[4].sname = "Ram";
        s[4].desg = "Security";
        s[4].sex = "male";
        s[4].salary = 15000;
		s[5].sid = "27";
        s[5].sname = "Syam";
        s[5].desg = "Security";
        s[5].sex = "male";
        s[5].salary = 14000;
		
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 0, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 0)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("1.Doctos   2.Patients   3.Medicines   4.Laboratories   5.Facilities   6.Staff ");
            System.out.println("----------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Which section would you like to explore? (Enter the corresponding number): ");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
						System.out.println();
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("                              ** DOCTOR SECTION **");
                        System.out.println("----------------------------------------------------------------------------------");
                        s1 = 1;
						boolean b = true;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            c1 = input.nextInt();
							System.out.println();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor(d, count1);count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("id \tName \t\t   Specilist \t\t Timing \t   Qualification \t      Room No. \t\tContact No.");
                                        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
								default:
									{
										System.out.println("You entered a Invalid choice!");
									}
                            }
							do 
							{
								System.out.print("\nPress 1 to return to the previous menu or 0 for the main menu: ");
								s1 = input.nextInt();
								if(s1 == 1 || s1 == 0) {
									break;
								}
								else {
									System.out.println();
									System.out.println("Please enter a valid choice");
								}
							}while(b);
                        }
                        break;
                    }
                case 2:
                    {
						System.out.println();
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("                            ** PATIENT SECTION **");
                        System.out.println("----------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
							System.out.println();
							System.out.print("Enter your choice: ");
                            c1 = input.nextInt();
							System.out.println();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient(p, count2);count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("-------------------------------------------------------------------------------------------------------");
										System.out.println("id  \t    Name \t\tDisease \t      Gender \t\t Admit Status \t\t  Age");
                                        System.out.println("-------------------------------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
								default:
								{
									System.out.println("You entered a Invalid choice!");
								}
                            }
                            do 
							{
								System.out.print("\nPress 1 to return to the previous menu or 0 for the main menu: ");
								s2 = input.nextInt();
								if(s2 == 1 || s2 == 0) {
									break;
								}
								else {
									System.out.println();
									System.out.println("Please enter a valid choice");
								}
							}while(s2 != 0);
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("                           ** MEDICINE SECTION **");
                        System.out.println("----------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Medicines List");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            c1 = input.nextInt();
							System.out.println();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].new_medi();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        System.out.println("  Name  \t       Company \t\t       Expiry Date \t       Cost/tablet");
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            m[j].find_medi();
                                        }
                                        break;
                                    }
								default:
								{
									System.out.println("You entered a Invalid choice!");
								}
                            }
                            do 
							{
								System.out.print("\nPress 1 to return to the previous menu or 0 for the main menu: ");
								s3 = input.nextInt();
								if(s3 == 1 || s3 == 0) {
									break;
								}
								else {
									System.out.println();
									System.out.println("Please enter a valid choice");
								}
							}while(s3 != 0);
                        }
                        break;
                    }
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
							System.out.println();
							System.out.print("Enter your choice: ");
							c1 = input.nextInt();
							System.out.println();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l[count4].new_feci();count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("  Facilities\t\t\t\t  Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++) {
                                            l[j].faci_list();
                                        }
                                        break;
                                    }
								default:
								{
									System.out.println("You entered a Invalid choice!");
								}
                            }
                            do 
							{
								System.out.print("\nPress 1 to return to the previous menu or 0 for the main menu: ");
								s4 = input.nextInt();
								if(s4 == 1 || s4 == 0) {
									break;
								}
								else {
									System.out.println();
									System.out.println("Please enter a valid choice");
								}
							}while(s4 != 0);
                        }
                        break;
                    }
                case 5:
                    {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("             **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1)
                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
							System.out.println();
							System.out.print("Enter your choice: ");
                            c1 = input.nextInt();
							System.out.println();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        f[count5].add_faci();
										count5++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("  Hospital  Facility \t\t       Helpline No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count5; j++) {
                                            f[j].show_faci();
                                        }
                                        break;
                                    }
								default:
								{
									System.out.println("You entered a Invalid choice!");
								}
                            }
                            do 
							{
								System.out.print("\nPress 1 to return to the previous menu or 0 for the main menu: ");
								s5 = input.nextInt();
								if(s5 == 1 || s5 == 0) {
									break;
								}
								else {
									System.out.println();
									System.out.println("Please enter a valid choice");
								}
							}while(s5 != 0);
                        }
                        break;
                    }
                case 6:
                    {
                        s6 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s6 == 1)
                        {
                            String a = "Nurse", b = "Worker", c = "Security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            c1 = input.nextInt();
							System.out.println();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count6].new_staff(s, count6);
										count6++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("-------------------------------------------------------------------------------------");
                                        System.out.println("  Id\t   Name \t     desigination \t    Gender \t      Salary/month");
                                        System.out.println("-------------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                            if (a.equalsIgnoreCase(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                case 3:
                                    {
                                        System.out.println("-------------------------------------------------------------------------------------");
                                        System.out.println("  Id\t   Name \t     desigination \t    Gender \t      Salary/month");
                                        System.out.println("-------------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                            if (b.equalsIgnoreCase(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        System.out.println("-------------------------------------------------------------------------------------");
                                        System.out.println("  Id\t   Name \t     desigination \t    Gender \t      Salary/month");
                                        System.out.println("-------------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                           if (c.equalsIgnoreCase(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
								default:
								{
									System.out.println("You entered a Invalid choice");
								}
                            }
                            do 
							{
								System.out.print("\nPress 1 to return to the previous menu or 0 for the main menu: ");
								s6 = input.nextInt();
								if(s6 == 1 || s6 == 0) {
									break;
								}
								else {
									System.out.println();
									System.out.println("Please enter a valid choice");
								}
							}while(s6 != 0);
                        }
                        break;
                    }
                default:
                    {
						System.out.println();
                        System.out.println("You Have Enter Wrong Choice!!!");
                    }
            }
        }
    }
}