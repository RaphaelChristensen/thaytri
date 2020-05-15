import java.awt.SystemTray;

//Giải bài tập Apriori 2 - môn Khai thác Dữ liệu

class bt1_2 {
	public static void main(String[] args) {
		//itemsetset
		String[] itemset = {"", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10", "M11"};
		
		int dem = 0; //Kiểm tra tổng số tập phổ biến nhằm tiếp tục hoặc kết thúc bài toán
		// ===================================== I N S E R T == V A L U E ======
            //$$$$$$$$$$$$$$$ Nhập tổng số lượng các hạng mục $$$$$$$$$$$
            int item = 11;
            int item_tab = item + 1; //Need null value so as to sync easily in arrays

            //$$$$$$$$$$$$$$$ Nhập lượng giao dịch $$$$$$$$$$$$$
            int tid = 35;
            int tid_tab = tid + 1; ////Need null value so as to sync easily in arrays

            //$$$$$$$$$$$$$$$ Nhập độ phổ biến (đơn vị %) $$$$$$$$$$$$$
            int minsupp = 20;
            int minsupp_count = minsupp*tid/100;
            System.out.println("===============||| Số đếm độ tin cậy = " + minsupp_count + "||| ===============");
            //$$$$$$$$$$$$$$$ Nhập độ tin cậy (đơn vị %) $$$$$$$$$$$$$
            int minconf = 50;
            float min_conf_pt = minconf/100;

            // ===================================== I N S E R T == V A L U E ======

            //Hàng : số giao dịch, cột : các đối tượng
            int tab[][] = new int[tid_tab][item_tab];
		
		
		for(int row = 0 ; row < tid_tab ; row++ ) {
			for(int col = 0 ; col < item_tab ; col++) {
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

		tab[1][3] = 1;
		tab[1][1] = 1;
		tab[1][4] = 1;
		tab[1][2] = 1;
		tab[1][6] = 1;
		tab[1][11] = 1;

		tab[2][5] = 1;
		tab[2][3] = 1;
		tab[2][1] = 1;
		tab[2][4] = 1;
		tab[2][6] = 1;
		tab[2][7] = 1;
		tab[2][8] = 1;
		tab[2][9] = 1;

		tab[3][6] = 1;
		tab[3][8] = 1;
		tab[3][1] = 1;
		tab[3][5] = 1;
		tab[3][10] = 1;

		tab[4][2] = 1;

		tab[5][3] = 1;
		tab[5][4] = 1;

		tab[6][1] = 1;
		tab[6][2] = 1;
		tab[6][3] = 1;
		tab[6][5] = 1;
		tab[6][6] = 1;
		tab[6][7] = 1;
		tab[6][8] = 1;
		tab[6][9] = 1;

		tab[7][2] = 1;
		tab[7][4] = 1;
		tab[7][6] = 1;
		tab[7][7] = 1;
		tab[7][8] = 1;

		tab[8][2] = 1;
		tab[8][1] = 1;
		tab[8][3] = 1;
		tab[8][4] = 1;
		tab[8][5] = 1;
		tab[8][6] = 1;
		tab[8][7] = 1;
		tab[8][8] = 1;

		tab[9][6] = 1;
		tab[9][8] = 1;
		tab[9][5] = 1;
		tab[9][1] = 1;
		tab[9][4] = 1;
		tab[9][3] = 1;
		tab[9][7] = 1;
		tab[9][2] = 1;

		tab[10][5] = 1;
		tab[10][1] = 1;
		tab[10][4] = 1;
		tab[10][3] = 1;
		tab[10][7] = 1;
		tab[10][10] = 1;

		tab[11][6] = 1;
		tab[11][1] = 1;
		tab[11][4] = 1;
		tab[11][2] = 1;
		tab[11][8] = 1;

		tab[12][7] = 1;
		tab[12][8] = 1;
		tab[12][2] = 1;

		tab[13][1] = 1;
		tab[13][3] = 1;
		tab[13][5] = 1;
		tab[13][7] = 1;

		tab[14][2] = 1;
		tab[14][4] = 1;
		tab[14][6] = 1;
		tab[14][8] = 1;
		tab[14][11] = 1;

		tab[15][1] = 1;
		tab[15][3] = 1;
		tab[15][6] = 1;
		tab[15][7] = 1;

		tab[16][4] = 1;
		tab[16][2] = 1;
		tab[16][8] = 1;
		tab[16][5] = 1;
		tab[16][3] = 1;

		tab[17][2] = 1;
		tab[17][4] = 1;
		tab[17][6] = 1;
		tab[17][7] = 1;

		tab[18][1] = 1;
		tab[18][2] = 1;
		tab[18][3] = 1;
		tab[18][5] = 1;
		tab[18][6] = 1;
		tab[18][7] = 1;
		tab[18][8] = 1;
		tab[18][10] = 1;
		tab[18][11] = 1;

		tab[19][1] = 1;
		tab[19][4] = 1;
		tab[19][3] = 1;
		tab[19][5] = 1;
		tab[19][6] = 1;

		tab[20][1] = 1;
		tab[20][2] = 1;
		tab[20][7] = 1;

		tab[21][8] = 1;
		tab[21][4] = 1;
		tab[21][3] = 1;
		tab[21][1] = 1;
		tab[21][5] = 1;
		tab[21][9] = 1;

		tab[22][5] = 1;
		tab[22][2] = 1;

		tab[23][3] = 1;

		tab[24][8] = 1;
		tab[24][1] = 1;
		tab[24][4] = 1;

		tab[25][2] = 1;
		tab[25][5] = 1;
		tab[25][6] = 1;
		tab[25][8] = 1;
		tab[25][4] = 1;
		tab[25][1] = 1;

		tab[26][2] = 1;
		tab[26][5] = 1;
		tab[26][8] = 1;

		tab[27][2] = 1;
		tab[27][3] = 1;
		tab[27][4] = 1;
		tab[27][8] = 1;
		tab[27][1] = 1;

		tab[28][6] = 1;
		tab[28][8] = 1;
		tab[28][1] = 1;
		tab[28][5] = 1;
		tab[28][4] = 1;
		tab[28][3] = 1;
		tab[28][7] = 1;
		tab[28][2] = 1;

		tab[29][1] = 1;

		tab[30][4] = 1;
		tab[30][5] = 1;
		tab[30][6] = 1;

		tab[31][2] = 1;
		tab[31][8] = 1;
		tab[31][6] = 1;
		tab[31][1] = 1;
		tab[31][9] = 1;

		tab[32][4] = 1;
		tab[32][8] = 1;
		tab[32][6] = 1;
		tab[32][2] = 1;

		tab[33][6] = 1;
		tab[33][1] = 1;
		tab[33][5] = 1;
		tab[33][3] = 1;
		tab[33][4] = 1;

		tab[34][1] = 1;
		tab[34][2] = 1;
		tab[34][3] = 1;
		tab[34][6] = 1;
		tab[34][7] = 1;
		tab[34][8] = 1;

		tab[35][4] = 1;
		tab[35][2] = 1;
		tab[35][3] = 1;
		tab[35][6] = 1;
		tab[35][5] = 1;
		tab[35][7] = 1;
		tab[35][8] = 1;
		tab[35][11] = 1;

		//print to check
		System.out.println("============||| Table |||================");
		for(int row = 0 ; row < tid_tab ; row++) {
			for(int col = 0 ; col < item_tab ; col++) {
				System.out.print(tab[row][col] + " ");
			}
			System.out.print("\n");
		}
		while(true) {
			//================================LET'S DO L1================================
			int l1[] = new int[item_tab];
			for(int i = 0 ; i < item_tab ; i++) l1[i] = 0;
			//=======================================counting L1===================
			for(int row = 1 ; row < tid_tab ; row++) {
				for(int col = 1 ; col < item_tab ; col ++) {
					if(tab[row][col] == 1) {
						l1[col]++;
					}
				}
			}
	        System.out.println("=====================================Result of L1==================================");
			for(int i = 1 ; i < item_tab ; i++) {
				if(l1[i] >= minsupp_count) {
					System.out.println(itemset[i] + " : " + l1[i]);
					dem++;
				}
			}
			
			//====================================Kiểm tra nhằm tiếp tục hoặc kết thúc bài toán
			if(dem==0) break;
			else dem=0;
			
			//======================================LET'S DO L2==========================
			int l2[][] = new int[item_tab][item_tab];
			for(int row = 0 ; row < item_tab ; row++) {
				for(int col = 0 ; col < item_tab ; col++) {
					l2[row][col] = 0;
				}
			}
			//=============================Counting L2=========================
			for(int col = 1 ; col < item_tab ; col++) {
				if(l1[col] < minsupp_count) continue;
				else {
					for(int row = 1 ; row < item_tab ; row++) {
						if(row == col) continue;
						else if(l1[row] < minsupp_count) continue;
						else {
							int row_num = 1;
							while(row_num < tid_tab) {
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
			for(int col = 1 ; col < item_tab ; col++) {
				if(l1[col] < minsupp_count) continue;
				else {
					for(int row = 1 ; row < item_tab ; row++) {
						if(row <= col) continue;
						else if(l1[row] < minsupp_count) continue;
						else {
							if(l2[row][col] >= minsupp_count) {
								System.out.print(itemset[col] + " & " + itemset[row] + " : " + l2[row][col]);
								
								//=====Confidence of L 2 ==============
								System.out.print("\n");
								System.out.print(" | conf (" + itemset[col] + "=>" + itemset[row] + ") = ");
								System.out.print(l2[row][col]*100/l1[col] + "% | ");
								System.out.print("\n");
								
								System.out.print(" | conf (" + itemset[row] + "=>" + itemset[col] + ") = ");
								System.out.print(l2[row][col]*100/l1[row] + "% | ");
								System.out.print("\n");
								System.out.println("===========================================");
								
								dem++;
							}
						}
					}
				}
			}
			

			//====================================Kiểm tra nhằm tiếp tục hoặc kết thúc bài toán
			if(dem==0) break;
			else dem=0;
			//=================================LET'S DO L 3 ==================
			int l3[][][] = new int[item_tab][item_tab][item_tab];
	        for(int row = 0 ; row < item_tab ; row++) {
	                for(int col = 0 ; col < item_tab ; col++) {
	                	for(int high = 0 ; high < item_tab ; high++) {
	                		l3[row][col][high] = 0;
						}
	                }
	        }
			//=================================Counting L 3 ==========================
	        for(int high = 1 ; high < item_tab ; high++) {
	        	for(int col = 1 ; col < item_tab ; col++) {
	        		if(l2[col][high] < minsupp_count || l2 [high][col] < minsupp_count) continue;
	        		else if(col == high) continue;
	        		else {
	                    for(int row = 1 ; row < item_tab ; row++) {
	    	                if(row == col || row == high) continue;
	                        else if(l2[row][col]<minsupp_count || l2[col][row]<minsupp_count || l2[row][high]<minsupp_count || l2[high][row]<minsupp_count || l2[col][high]<minsupp_count || l2[high][col]<minsupp_count) continue;
	                        else {
	                            int row_num = 1;
	                            while(row_num < tid_tab) {
	                               if(tab[row_num][row] == 1 && tab[row_num][col] == 1 && tab[row_num][high] == 1) {
	                                   l3[row][col][high]++;
	                               }
	                               row_num++;
	                            }
	                        }
	                    }
	        		}
	        	}
	        }
	        
	        System.out.println("=====================================Result of L3==================================");
			for(int high = 1 ; high < item_tab ; high++) {
	        	for(int col = 1 ; col < item_tab ; col++) {
	        		if(l2[col][high] < minsupp_count || l2 [high][col] < minsupp_count) continue;
	        		else if(col <= high) continue;
	        		else {
	                    for(int row = 1 ; row < item_tab ; row++) {
	    	                if(row <= high || row <= col) continue;
	                        else if(l2[row][col]<minsupp_count || l2[col][row]<minsupp_count || l2[row][high]<minsupp_count || l2[high][row]<minsupp_count || l2[col][high]<minsupp_count || l2[high][col]<minsupp_count) continue;
	                        else {
	    						if(l3[row][col][high] >= minsupp_count) {
	    							System.out.print(itemset[high] + " & " + itemset[col] + " & " + itemset[row] + " : " + l3[row][col][high]);
	    							//=====Confidence of L 2 ==============
	    							System.out.print("\n");
									System.out.print(" | conf (" + itemset[row] + ", " + itemset[col] + "=>" + itemset[high] + ") = ");
									System.out.print(l3[row][col][high]*100/l2[row][col] + "% | ");
									System.out.print("\n");
	    							
									System.out.print(" | conf (" + itemset[row] + ", " + itemset[high] + "=>" + itemset[col] + ") = ");
									System.out.print(l3[row][col][high]*100/l2[row][high] + "% | ");
									System.out.print("\n");
									
									System.out.print(" | conf (" + itemset[col] + ", " + itemset[high] + "=>" + itemset[row] + ") = ");
									System.out.print(l3[row][col][high]*100/l2[col][high] + "% | ");
									System.out.print("\n");
									
									System.out.print(" | conf (" + itemset[row] + "=>" + itemset[col] + ", " + itemset[high] + ") = ");
									System.out.print(l3[row][col][high]*100/l1[row] + "% | ");
									System.out.print("\n");
									
									System.out.print(" | conf (" + itemset[col] + "=>" + itemset[row] + ", " + itemset[high] + ") = ");
									System.out.print(l3[row][col][high]*100/l1[col] + "% | ");
									System.out.print("\n");
									
									System.out.print(" | conf (" + itemset[high] + "=>" + itemset[col] + ", " + itemset[row] + ") = ");
									System.out.print(l3[row][col][high]*100/l1[high] + "% | ");
									System.out.print("\n");
									System.out.println("===========================================");
	    							dem++;
	    						}
	                        }
	                    }
	        		}
	        	}
			}
			

			//====================================Kiểm tra nhằm tiếp tục hoặc kết thúc bài toán
			
			dem = 0;//||||||||||||Tạm vậy đã||||||||||||||||
			
			if(dem==0) break;
			else dem=0;
		}
	}
}



