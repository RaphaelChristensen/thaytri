import java.awt.SystemTray;

class bt1_1 {
	public static void main(String[] args) {
		//itemsetset
		String[] itemset = {"", "Blouse", "Jeans", "Shoes", "Shorts", "Skirt", "TShirt"};
		
		int dem = 0; //Kiểm tra tổng số tập phổ biến nhằm tiếp tục hoặc kết thúc bài toán
		// ===================================== I N S E R T == V A L U E ======
            //$$$$$$$$$$$$$$$ Nhập tổng số lượng các hạng mục $$$$$$$$$$$
            int item = 6;
            int item_tab = item + 1; //Need null value so as to sync easily in arrays

            //$$$$$$$$$$$$$$$ Nhập lượng giao dịch $$$$$$$$$$$$$
            int tid = 20;
            int tid_tab = tid + 1; ////Need null value so as to sync easily in arrays

            //$$$$$$$$$$$$$$$ Nhập độ phổ biến (đơn vị %) $$$$$$$$$$$$$
            int minsupp = 30;
            int minsupp_count = minsupp*tid/100;
            System.out.println("===============||| Số đếm độ tin cậy = " + minsupp_count + "||| ===============");
            //$$$$$$$$$$$$$$$ Nhập độ tin cậy (đơn vị %) $$$$$$$$$$$$$
            int minconf = 30;
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



