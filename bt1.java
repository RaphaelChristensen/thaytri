class bt1 {
	public static void main(String[] args) {
		//itemset
		String[] item = {"", "Blouse", "Jeans", "Shoes", "Shorts", "Skirt", "TShirt"};
		//table with 7 columns and 21 rows
		int tab[][] = new int[21][7];
		//default all value is 0 and add heading row
		for(int row = 0 ; row < 21 ; row++ ) {
			for(int col = 0 ; col < 7 ; col++) {
				if(col == 0) {
					tab[row][col] = row;
				} else if(row == 0) {
					tab[row][col] = col;
				} else {
					tab[row][col] = 0;
				}
			}
		}
		//insert value

		tab[1][1] = 1;

		tab[2][3] = 1;
		tab[2][5] = 1;
		tab[2][6] = 1;

		tab[3][2] = 1;
		tab[3][6] = 1;

		tab[4][2] = 1;
		tab[4][3] = 1;
		tab[4][6] = 1;

		tab[5][2] = 1;
		tab[5][4] = 1;

		tab[6][3] = 1;
		tab[6][6] = 1;

		tab[7][2] = 1;
		tab[7][5] = 1;

		tab[8][2] = 1;
		tab[8][3] = 1;
		tab[8][4] = 1;
		tab[8][6] = 1;

		tab[9][2] = 1;

		tab[10][2] = 1;
		tab[10][3] = 1;
		tab[10][6] = 1;

		tab[11][6] = 1;

		tab[12][1] = 1;
		tab[12][2] = 1;
		tab[12][3] = 1;
		tab[12][5] = 1;
		tab[12][6] = 1;

		tab[13][2] = 1;
		tab[13][3] = 1;
		tab[13][4] = 1;
		tab[13][6] = 1;

		tab[14][3] = 1;
		tab[14][5] = 1;
		tab[14][6] = 1;

		tab[15][2] = 1;
		tab[15][6] = 1;

		tab[16][5] = 1;
		tab[16][6] = 1;

		tab[17][2] = 1;
		tab[17][1] = 1;
		tab[17][5] = 1;

		tab[18][2] = 1;
		tab[18][3] = 1;
		tab[18][4] = 1;
		tab[18][6] = 1;

		tab[19][2] = 1;

		tab[20][2] = 1;
		tab[20][3] = 1;
		tab[20][4] = 1;
		tab[20][6] = 1;

		//print to check
		for(int row = 0 ; row < 21 ; row++) {
			for(int col = 0 ; col < 7 ; col++) {
				System.out.print(tab[row][col] + " ");
			}
			System.out.print("\n");
		}

		//================================LET'S DO L1================================
		int dem[] = new int[7];
		for(int i = 0 ; i < 7 ; i++) dem[i] = 0;
		//=======================================counting L1===================
		for(int row = 1 ; row < 21 ; row++) {
			for(int col = 1 ; col < 7 ; col ++) {
				if(tab[row][col] == 1) {
					dem[col]++;
				}
			}
		}
                System.out.println("=====================================Result of L1==================================");
		for(int i = 1 ; i < 7 ; i++) {
			System.out.print(item[i] + " : " + dem[i]);
			if(dem[i] < 6) {
				System.out.println(" xx loai");
			} else {
				System.out.println(" $$ NHAN $$");
			}
		}
		//======================================LET'S DO L2==========================
		int l2[][] = new int[7][7];
		for(int row = 0 ; row < 7 ; row++) {
			for(int col = 0 ; col < 7 ; col++) {
				l2[row][col] = 0;
			}
		}
		//=============================Counting L2=========================
		for(int row = 1 ; row < 7 ; row++) {
			if(dem[row] < 6) continue;
			else {
				for(int col = 1 ; col < 7 ; col++) {
					if(col == row) continue;
					else if(dem[col]<6) continue;
					else {
						int row_num = 1;
						while(row_num < 21) {
							if(tab[row_num][row] == 1 && tab[row_num][col] == 1) {
								l2[row][col]++;
							}
							row_num++;
						}
					}
				}
			}
		}
		System.out.println("=====================================Result of L2==================================");
		for(int row = 1 ; row < 7 ; row++) {
			if(dem[row] < 6) continue;
			else {
				for(int col = 1 ; col < 7 ; col++) {
					if(col <= row) continue;
					else if(dem[col] < 6) continue;
					else {
						System.out.print(item[row] + " & " + item[col] + " : " + l2[row][col]);
						if(l2[row][col] < 6) {
			                                System.out.println(" xx loai");
			                        } else {
			                                System.out.println(" $$ NHAN $$");
			                        }
					}
				}
			}
		}
		//=================================LET'S DO L 3 ==================
		

	}
}


