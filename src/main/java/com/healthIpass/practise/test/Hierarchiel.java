package com.healthIpass.practise.test;

import java.util.Scanner;

import com.google.gson.Gson;

/**
 * @author ritesht
 *
 */
public class Hierarchiel {

	public static void main(String[] args) {
		Gson gson = new Gson();
		/*MemberDetails memberDetails = new MemberDetails("Ritesh", "India", 1);
		memberDetails.getMemberDetailsList().add(0, new MemberDetails("Bonnalo", "Telangana", 2));
		memberDetails.getMemberDetailsList().add(1, new MemberDetails("Balaji", "AP", 4));
		memberDetails.getMemberDetailsList().get(0).getMemberDetailsList().add(0, new MemberDetails("Pedamm", "Hyderabad", 6));
		String json = gson.toJson(memberDetails);
*/		
		Scanner sc = new Scanner(System.in);

		String json = gson.toJson(recurMethodCre("Ritesh", "India", 1, 1,null,sc));
		System.out.println(json);

		sc.close();
		
	}

	public static MemberDetails recurMethodCre(String name, String loc, int index,int locId, MemberDetails memberDetail2, Scanner sc) {
		if(memberDetail2 == null)
			memberDetail2 = new MemberDetails(name, loc, locId);
		
		MemberDetails memberDetails = null;
		System.out.println("please provide count for locID");
		int getLocIdCount = Integer.valueOf(sc.nextLine());
		
		
		
		for (int i = 1; i <= getLocIdCount; i++) {
			System.out.println("please provide name for locID");	
			String name1 = sc.nextLine();
			System.out.println("please provide locID");
			int locsId = Integer.valueOf(sc.nextLine());
			System.out.println("please provide Location for locID");	
			String locs = sc.nextLine();
			memberDetails =  new MemberDetails(name1, locs, locsId);
			memberDetail2.getMemberDetailsList().add(memberDetails);
			
			recurMethodCre(name1, locs, i,locsId, memberDetails,sc);
		}

		return memberDetail2;
	}

}
