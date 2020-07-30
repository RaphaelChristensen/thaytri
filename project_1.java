import java.awt.SystemTray;

//Giải bài tập Đồ án_Bài tập 1 bằng Apriori - môn Khai thác Dữ liệu

class project_1 {
	public static void main(String[] args) {
		//itemsetset
		String[] itemset = {"", "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10", "I11"};

		int dem = 0; //Kiểm tra tổng số tập phổ biến nhằm tiếp tục hoặc kết thúc bài toán
		// ===================================== I N S E R T == V A L U E ======
						//$$$$$$$$$$$$$$$ Nhập tổng số lượng các hạng mục $$$$$$$$$$$
						int item = 11;
						int item_tab = item + 1; //Need null value so as to sync easily in arrays

						//$$$$$$$$$$$$$$$ Nhập lượng giao dịch $$$$$$$$$$$$$
						int tid = 39;
						int tid_tab = tid + 1; ////Need null value so as to sync easily in arrays

						//$$$$$$$$$$$$$$$ Nhập độ phổ biến (đơn vị %) $$$$$$$$$$$$$
						int minsupp = 20;
						int minsupp_count = minsupp*tid/100;
						System.out.println("===============||| Supp_count = " + minsupp_count + "||| ===============");
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

				tab[1][10] = 1;
				tab[1][3] = 1;
				tab[1][1] = 1;
				tab[1][4] = 1;
				tab[1][2] = 1;
				tab[1][6] = 1;
				tab[1][11] = 1;

				tab[2][6] = 1;
				tab[2][3] = 1;
				tab[2][1] = 1;
				tab[2][7] = 1;
				tab[2][8] = 1;
				tab[2][9] = 1;

				tab[3][5] = 1;
				tab[3][8] = 1;
				tab[3][1] = 1;
				tab[3][6] = 1;
				tab[3][10] = 1;

				tab[4][3] = 1;

				tab[5][10] = 1;

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

				tab[8][2] = 1;
				tab[8][1] = 1;
				tab[8][3] = 1;
				tab[8][4] = 1;
				tab[8][5] = 1;
				tab[8][6] = 1;
				tab[8][8] = 1;

				tab[9][6] = 1;
				tab[9][8] = 1;
				tab[9][1] = 1;
				tab[9][4] = 1;
				tab[9][3] = 1;
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

				tab[12][8] = 1;
				tab[12][1] = 1;
				tab[12][4] = 1;

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
				tab[17][9] = 1;

				tab[18][1] = 1;
				tab[18][2] = 1;
				tab[18][3] = 1;
				tab[18][5] = 1;
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
				tab[22][10] = 1;

				tab[23][3] = 1;
				tab[23][4] = 1;

				tab[24][7] = 1;
				tab[24][8] = 1;
				tab[24][2] = 1;
				tab[24][3] = 1;

				tab[25][2] = 1;
				tab[25][5] = 1;
				tab[25][6] = 1;
				tab[25][8] = 1;
				tab[25][4] = 1;
				tab[25][1] = 1;

				tab[26][2] = 1;
				tab[26][5] = 1;
				tab[26][8] = 1;
				tab[26][11] = 1;

				tab[27][2] = 1;
				tab[27][3] = 1;
				tab[27][1] = 1;
				tab[27][8] = 1;
				tab[27][6] = 1;

				tab[28][6] = 1;
				tab[28][8] = 1;
				tab[28][1] = 1;
				tab[28][5] = 1;
				tab[28][4] = 1;
				tab[28][3] = 1;
				tab[28][7] = 1;
				tab[28][2] = 1;

				tab[29][11] = 1;

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
				tab[35][5] = 1;
				tab[35][7] = 1;
				tab[35][8] = 1;
				tab[35][11] = 1;

				tab[36][5] = 1;
				tab[36][2] = 1;

				tab[37][3] = 1;
				tab[37][8] = 1;
				tab[37][9] = 1;
				tab[37][6] = 1;

				tab[38][1] = 1;

				tab[39][11] = 1;
				tab[39][6] = 1;
				tab[39][5] = 1;
				tab[39][2] = 1;
				tab[39][4] = 1;
				tab[39][3] = 1;
				tab[39][1] = 1;

		//print to check
		System.out.println("============||| Table |||================");
		for(int ox = 0 ; ox < tid_tab ; ox++) {
			for(int oy = 0 ; oy < item_tab ; oy++) {
				System.out.print(tab[ox][oy] + " ");
			}
			System.out.print("\n");
		}
		while(true) {
			//================================LET'S DO L1================================
			int l1[] = new int[item_tab];
			for(int i = 0 ; i < item_tab ; i++) l1[i] = 0;
			//=======================================counting L1===================
			for(int ox = 1 ; ox < tid_tab ; ox++) {
				for(int oy = 1 ; oy < item_tab ; oy ++) {
					if(tab[ox][oy] == 1) {
						l1[oy]++;
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
			for(int ox = 0 ; ox < item_tab ; ox++) {
				for(int oy = 0 ; oy < item_tab ; oy++) {
					l2[ox][oy] = 0;
				}
			}
			//=============================Counting L2=========================
			for(int oy = 1 ; oy < item_tab ; oy++) {
				if(l1[oy] < minsupp_count) continue;
				else {
					for(int ox = 1 ; ox < item_tab ; ox++) {
						if(ox == oy) continue;
						else if(l1[ox] < minsupp_count) continue;
						else {
							int ox_num = 1;
							while(ox_num < tid_tab) {
								if(tab[ox_num][ox] == 1 && tab[ox_num][oy] == 1) {
									l2[ox][oy]++;
								}
								ox_num++;
							}
						}
					}
				}
			}

			System.out.println("=====================================Result of L2==================================");
			for(int oy = 1 ; oy < item_tab ; oy++) {
				if(l1[oy] < minsupp_count) continue;
				else {
					for(int ox = 1 ; ox < item_tab ; ox++) {
						if(ox <= oy) continue;
						else if(l1[ox] < minsupp_count) continue;
						else {
							if(l2[ox][oy] >= minsupp_count) {
								System.out.print(itemset[oy] + " & " + itemset[ox] + " : " + l2[ox][oy]);

								//=====Confidence of L 2 ==============
								System.out.print("\n");
								System.out.print(" | conf (" + itemset[oy] + "=>" + itemset[ox] + ") = ");
								System.out.print(l2[ox][oy]*100/l1[oy] + "% | ");
								System.out.print("\n");

								System.out.print(" | conf (" + itemset[ox] + "=>" + itemset[oy] + ") = ");
								System.out.print(l2[ox][oy]*100/l1[ox] + "% | ");
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
	        for(int ox = 0 ; ox < item_tab ; ox++) {
	                for(int oy = 0 ; oy < item_tab ; oy++) {
	                	for(int oz = 0 ; oz < item_tab ; oz++) {
	                		l3[ox][oy][oz] = 0;
						}
	                }
	        }
			//=================================Counting L 3 ==========================
	        for(int oz = 1 ; oz < item_tab ; oz++) {
	        	for(int oy = 1 ; oy < item_tab ; oy++) {
	        		if(l2[oy][oz] < minsupp_count || l2 [oz][oy] < minsupp_count) continue;
	        		else if(oy == oz) continue;
	        		else {
	                    for(int ox = 1 ; ox < item_tab ; ox++) {
	    	                if(ox == oy || ox == oz) continue;
	                        else if(l2[ox][oy]<minsupp_count || l2[oy][ox]<minsupp_count || l2[ox][oz]<minsupp_count || l2[oz][ox]<minsupp_count || l2[oy][oz]<minsupp_count || l2[oz][oy]<minsupp_count) continue;
	                        else {
	                            int ox_num = 1;
	                            while(ox_num < tid_tab) {
	                               if(tab[ox_num][ox] == 1 && tab[ox_num][oy] == 1 && tab[ox_num][oz] == 1) {
	                                   l3[ox][oy][oz]++;
	                               }
	                               ox_num++;
	                            }
	                        }
	                    }
	        		}
	        	}
	        }

	        System.out.println("=====================================Result of L3==================================");
			for(int oz = 1 ; oz < item_tab ; oz++) {
	        	for(int oy = 1 ; oy < item_tab ; oy++) {
	        		if(l2[oy][oz] < minsupp_count || l2 [oz][oy] < minsupp_count) continue;
	        		else if(oy <= oz) continue;
	        		else {
	                    for(int ox = 1 ; ox < item_tab ; ox++) {
	    	                if(ox <= oz || ox <= oy) continue;
	                        else if(l2[ox][oy]<minsupp_count || l2[oy][ox]<minsupp_count || l2[ox][oz]<minsupp_count || l2[oz][ox]<minsupp_count || l2[oy][oz]<minsupp_count || l2[oz][oy]<minsupp_count) continue;
	                        else {
	    						if(l3[ox][oy][oz] >= minsupp_count) {
	    							System.out.print(itemset[oz] + " & " + itemset[oy] + " & " + itemset[ox] + " : " + l3[ox][oy][oz]);
	    							//=====Confidence of L 2 ==============
	    							System.out.print("\n");
									System.out.print(" | conf (" + itemset[ox] + ", " + itemset[oy] + "=>" + itemset[oz] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l2[ox][oy] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[ox] + ", " + itemset[oz] + "=>" + itemset[oy] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l2[ox][oz] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[oy] + ", " + itemset[oz] + "=>" + itemset[ox] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l2[oy][oz] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[ox] + "=>" + itemset[oy] + ", " + itemset[oz] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l1[ox] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[oy] + "=>" + itemset[ox] + ", " + itemset[oz] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l1[oy] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[oz] + "=>" + itemset[oy] + ", " + itemset[ox] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l1[oz] + "% | ");
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
			if(dem==0) break;
			else dem=0;



			//=================================LET'S DO L 4 ==================
			int l4[][][][] = new int[item_tab][item_tab][item_tab][item_tab];
	        for(int ox = 0 ; ox < item_tab ; ox++) {
	                for(int oy = 0 ; oy < item_tab ; oy++) {
	                	for(int oz = 0 ; oz < item_tab ; oz++) {
	                		for(int ot = 0 ; ot < item_tab ; ot++) {
												l4[ox][oy][oz][ot] = 0;
											}
										}
	                }
	        }
			//=================================Counting L 4 ==========================
					for(int ot = 1 ; ot < item_tab ; ot++) {
						for(int oz = 1 ; oz < item_tab ; oz++) {
							if()
		        	for(int oy = 1 ; oy < item_tab ; oy++) {
		        		if(l2[oy][oz] < minsupp_count || l2 [oz][oy] < minsupp_count) continue;
		        		else if(oy == oz) continue;
		        		else {
		                    for(int ox = 1 ; ox < item_tab ; ox++) {
		    	                if(ox == oy || ox == oz) continue;
		                        else if(l2[ox][oy]<minsupp_count || l2[oy][ox]<minsupp_count || l2[ox][oz]<minsupp_count || l2[oz][ox]<minsupp_count || l2[oy][oz]<minsupp_count || l2[oz][oy]<minsupp_count) continue;
		                        else {
		                            int ox_num = 1;
		                            while(ox_num < tid_tab) {
		                               if(tab[ox_num][ox] == 1 && tab[ox_num][oy] == 1 && tab[ox_num][oz] == 1) {
		                                   l3[ox][oy][oz]++;
		                               }
		                               ox_num++;
		                            }
		                        }
		                    }
		        				}
		        		}
		        	}
					}
	        System.out.println("=====================================Result of L4==================================");
			for(int oz = 1 ; oz < item_tab ; oz++) {
	        	for(int oy = 1 ; oy < item_tab ; oy++) {
	        		if(l2[oy][oz] < minsupp_count || l2 [oz][oy] < minsupp_count) continue;
	        		else if(oy <= oz) continue;
	        		else {
	                    for(int ox = 1 ; ox < item_tab ; ox++) {
	    	                if(ox <= oz || ox <= oy) continue;
	                        else if(l2[ox][oy]<minsupp_count || l2[oy][ox]<minsupp_count || l2[ox][oz]<minsupp_count || l2[oz][ox]<minsupp_count || l2[oy][oz]<minsupp_count || l2[oz][oy]<minsupp_count) continue;
	                        else {
	    						if(l3[ox][oy][oz] >= minsupp_count) {
	    							System.out.print(itemset[oz] + " & " + itemset[oy] + " & " + itemset[ox] + " : " + l3[ox][oy][oz]);
	    							//=====Confidence of L 2 ==============
	    							System.out.print("\n");
									System.out.print(" | conf (" + itemset[ox] + ", " + itemset[oy] + "=>" + itemset[oz] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l2[ox][oy] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[ox] + ", " + itemset[oz] + "=>" + itemset[oy] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l2[ox][oz] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[oy] + ", " + itemset[oz] + "=>" + itemset[ox] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l2[oy][oz] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[ox] + "=>" + itemset[oy] + ", " + itemset[oz] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l1[ox] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[oy] + "=>" + itemset[ox] + ", " + itemset[oz] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l1[oy] + "% | ");
									System.out.print("\n");

									System.out.print(" | conf (" + itemset[oz] + "=>" + itemset[oy] + ", " + itemset[ox] + ") = ");
									System.out.print(l3[ox][oy][oz]*100/l1[oz] + "% | ");
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
					dem=0;

					if(dem==0) break;
					else dem=0;



		}
	}
}
