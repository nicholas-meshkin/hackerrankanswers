package hackerrankanswers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Answers {

		static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        List<Integer> scoreComp = new ArrayList<>();
	        scoreComp.add(0);
	        scoreComp.add(0);
	        for(int i=0;i<a.size();i++) {
	        	if(a.get(i)>b.get(i)) {
	        		scoreComp.set(0, scoreComp.get(0)+1);
	        		}else if (a.get(i)<b.get(i)) {
	        			scoreComp.set(1, scoreComp.get(1)+1);
	        		}
	        }
	        	return scoreComp;

	}
		
		static int diagonalDifference(int[][] arr) {
	        int sum1=0;
	        int sum2 = 0;
	        int size = arr[0].length;
	        for(int i=0;i<size;i++) {
	            sum1+=arr[i][i];
	            sum2+=arr[i][size-1-i];
	        }
	        int diff = Math.abs(sum1-sum2);
	        return diff;
	    }
		
		static void plusMinus(int[] arr) {
	        int plusC = 0;
	        int minusC=0;
	        int zC = 0;
	        for (int i=0;i<arr.length;i++){
	            if(arr[i]>0){plusC++;}
	            if(arr[i]<0){minusC++;}
	            if(arr[i]==0){zC++;}
	        }
	        double plusF = (double)plusC/arr.length;
	        double minusF = (double)minusC/arr.length;
	        double zF = (double)zC/arr.length;
	        System.out.printf("%.6f", plusF);
	        System.out.println();
	        System.out.printf("%.6f", minusF);
	         System.out.println();
	        System.out.printf("%.6f", zF);

	    }
		
		 static void staircase(int n) {
			int ticks =0;
			 for (int i=0;i<n;i++) {
				 ticks++;
				 String x = " ";
				 String y="#";
				 String z="";
				 for(int j=0;j<n-i-1;j++) {
					 z+=x;
				 }
				 for(int h=0;h<ticks;h++) {
					 z+=y;
				 }
				 System.out.println(z);
			 }

		    }
		 
		 static void miniMaxSum(int[] arr) {
			 long min=arr[0];
			 long max=arr[0];
			 long sum = 0;
			 for(int i=0;i<arr.length;i++) {
				 long temp =arr[i];
				 if(temp>max) {max=temp;}
				 if(temp<min) {min=temp;}
				 sum+=temp;
			 }
			 long maxsum=sum-min;
			 long minsum=sum-max;
			 System.out.println(minsum + " " + maxsum);
		    }

		 static int birthdayCakeCandles(int[] ar) {
			 int max = ar[0];
			 int count = 0;
			 for (int i=0;i<ar.length;i++) {
				 if(ar[i]>max) {max = ar[i];}
			 }
			 for(int i=0;i<ar.length;i++) {
				 if(ar[i]==max) {count++;}
			 }
			 return count;

		    }
		 
		 static String timeConversion(String s) {
		        String timeSign = s.substring(8);
		        int hour = Integer.parseInt(s.substring(0,2));
		        
		        if(timeSign.equalsIgnoreCase("AM") && hour==12) {
		        	return "00"+s.substring(2, 8);
		        }else if(timeSign.equalsIgnoreCase("AM") && hour!=12){
		        	return s.substring(0, 8);
		        }else if(timeSign.equalsIgnoreCase("PM") && hour!=12) {
		        	hour+=12;
		        	return hour+s.substring(2, 8);
		        }else {
		        	return s.substring(0, 8);
		        }

		    }
		 
		 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
			 int aHit = 0;
			 int oHit = 0;
			 for(int i=0;i<apples.length;i++) {
				 if(a+apples[i]>=s && a+apples[i]<=t) {
					 aHit++;
				 }
			 }
			 for(int i=0;i<oranges.length;i++) {
				 if(b+oranges[i]>=s && b+oranges[i]<=t) {
					 oHit++;
				 }
			 }	
			 System.out.println(aHit);
			 System.out.println(oHit);
		    }
		 
		 static String kangaroo(int x1, int v1, int x2, int v2) {
			 if((x1>x2 && v1>v2)||(x2>x1 && v2>v1)) {
				 return ("NO");
			 }
			 for(int i=0;i<1000;i++) {
				 if(x1+(v1*i)==x2+(v2*i)) {
					 return("YES");
				 }
			 }
			 return("NO");

		    }
		 
		 static int getTotalX(int[] a, int[] b) {
			 int count=0;
			 int min = 0;
			 int max = 0;
			 for(int i=0;i<a.length;i++) {
				 if(a[i]>min) {}min=a[i];
			 }
			 for(int i=0;i<b.length;i++) {
				 if(b[i]<max) {}max=b[i];
			 }
		        for(int i=min;i<=max;i++) {
		        	int countA = 0;
		        	for(int j=0;j<a.length;j++) {
		        		if(i%a[j]==0) {
		        		countA++;
		        		}
		        	}
		        	
		        	if(countA==a.length) {
		        		int countB=0;
		        		for(int h=0;h<b.length;h++) {
		        			if(b[h]%i==0) {
		        				countB++;
		        			}
		        		}
		        		if(countB==b.length) {
		        			count++;
		        		}
		        	}
		        	
		        }
		        return count;

		    }
		 
		 static int[] breakingRecords(int[] scores) {
			 int max = scores[0];
			 int min = scores[0];
			 int maxB=0;
			 int minB=0;
			 for(int i=1;i<scores.length;i++) {
				 if(scores[i]>max) {
					 max=scores[i];
					 maxB++;
				 }
				 if(scores[i]<min) {
					 min=scores[i];
					 minB++;
				 }
			 }
			 int[] x = {maxB,minB};
			 return x;
		 }
		 
		 static int birthday(List<Integer> s, int d, int m) {
			 	int count = 0;
			 	for(int i=0;i<s.size();i++) {
			 		int sum = 0;
			 		for(int j=0;j<m;j++) {
			 			if(i+j>s.size()-1) {
			 				break;
			 			}
			 			sum+=s.get(i+j);
			 		}
			 		if(sum==d) {
			 			count++;
			 		}
			 	}
			 	return count;

		    }
		 
		 static int divisibleSumPairs(int n, int k, int[] ar) {
			 int count=0;
			 for(int i = 0;i<ar.length;i++) {
				 for(int j=i+1;j<ar.length;j++) {
					 if((ar[i]+ar[j])%k==0) {
						 count++;
					 }
				 }
			 }
			 return count;

		    }
		 
		 static int migratoryBirds(List<Integer> arr) {

			List<Integer> countArr = new ArrayList<>();
			countArr.add(0);
			countArr.add(0);
			countArr.add(0);
			countArr.add(0);
			countArr.add(0);
			 for(int i=0;i<arr.size();i++) {
				 if(arr.get(i)==1) {countArr.set(0, countArr.get(0)+1);}
				 if(arr.get(i)==2) {countArr.set(1, countArr.get(1)+1);}
				 if(arr.get(i)==3) {countArr.set(2, countArr.get(2)+1);}
				 if(arr.get(i)==4) {countArr.set(3, countArr.get(3)+1);}
				 if(arr.get(i)==5) {countArr.set(4, countArr.get(4)+1);}
			 }
			 int max=0;
			 int maxNum=0;
			 for(int i=0;i<countArr.size();i++) {
				 if(countArr.get(i)>max) {
					 max=countArr.get(i);
					 maxNum=(i+1);
				 }
			 }
			 return maxNum;

		    }
		 
		 static void bonAppetit(List<Integer> bill, int k, int b) {
			 int annaP = 0;
			 int total = 0;
			 for(int i=0;i<bill.size();i++) {
				 total+=bill.get(i);
			 }
			 annaP = (total-bill.get(k))/2;
			 if(annaP==b) {
				 System.out.println("Bon Appetit");
			 }else {
				 System.out.println(b-annaP);
			 }
		    }
		 
		 static int sockMerchant(int n, int[] ar) {
			 Map<Integer,Integer> socks = new HashMap<>();
			 int pairs = 0;
			 System.out.println(ar.toString());
			 for(int i=0;i<ar.length;i++) {
				 if(socks.containsKey(ar[i])) {
					 Integer currInt = socks.get(ar[i])+1;
					 socks.put(ar[i], currInt);
					 System.out.println(ar[i]);
					 System.out.println(socks.get(ar[i]));
					 System.out.println();
				 }else {
					 Integer currInt = 1;
					 socks.put(ar[i], currInt);
				 }
			 }
			 for(Integer key : socks.keySet()) {
				 if(socks.get(key)%2==0) {
					 pairs+=(socks.get(key))/2;
				 }else {
					 pairs+=(socks.get(key)-1)/2;
				 }
			 }
			 System.out.println();System.out.println(pairs);
			 return pairs;
		    }
		 
		 static int pageCount(int n, int p) {
             
             int fP=1;
             int fTurns=0;
             int bP=n;
             int bTurns=0;
             boolean evenPgs = false;
             if(n%2==0) {evenPgs=true;}
             
             for(int i=0;i<n;i++) {
                 if(fP==p||fP-1==p) {
                     return fTurns;
                 }else{
                     fP+=2;
                     fTurns++;
                 }
                 if(evenPgs&&(bP==p||bP+1==p)) {
                     return bTurns;
                 }else if(!evenPgs&&(bP==p||bP-1==p)) {
                     return bTurns;
                 }else{
                     bP-=2;
                     bTurns++;
                 }
             }
             return fTurns;
             
            }
		
		static int countingValleys(int n, String s) {//only passed 18/22 tests
			int currLvl=0;
			int vCount=0;
			boolean inValley=false;
			if(s.charAt(0)=='D') {
				currLvl--;
			}
			if(s.charAt(0)=='U') {
				currLvl++;
			}
			for(int i=1;i<s.length();i++) {
				if(s.charAt(i)=='D') {
					currLvl--;
				}
				if(s.charAt(i)=='U') {
					currLvl++;
				}
				if(s.charAt(i)=='D'&&currLvl<0) {
					inValley=true;
				}
				if(currLvl==0&&s.charAt(i)=='U'&&inValley==true) {
					vCount++;
				}
				if(currLvl>=0) {
					inValley=false;
				}
			}
			return vCount;
			}
		
		 static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		       int minK = 1000000;
		       int minD = 1000000;
		       int maxK=0;
		       int maxD=0;
		       int spent=-1;
		       for(int i=0;i<keyboards.length;i++) {
		    	   if(keyboards[i]>maxK) {
		    		   maxK=keyboards[i];
		    	   }
		       }
		       for(int i=0;i<drives.length;i++) {
		    	   if(drives[i]>maxD) {
		    		   maxD=drives[i];
		    	   }
		       }
		       for(int i=0;i<keyboards.length;i++) {
		    	   if(keyboards[i]<minK) {
		    		   minK=keyboards[i];
		    	   }
		       }
		       for(int i=0;i<drives.length;i++) {
		    	   if(drives[i]<minD) {
		    		   minD=drives[i];
		    	   }
		       }
		      if(maxK+maxD<b) {
		    	  spent=maxK+maxD;
		    	  return spent;
		      }
		      if(minK+minD>b) {
		    	  return spent;
		      }
		      
		     int maxCombo=0;
		     int currK = 0;
		     int currD = 0;
		     for(int i=0;i<keyboards.length;i++) {
		    	 currK =keyboards[i];
		    	 for(int j=0;j<drives.length;j++) {
		    		 currD=drives[j];
		    		 if(currD+currK>maxCombo&&currD+currK<=b) {
		    			 maxCombo=currK+currD;
		    		 }
		    	 }
		     }
		      spent=maxCombo;
		      return spent;
		    }
		 
		 static String catAndMouse(int x, int y, int z) {
			 String o1 = "Cat A";
			 String o2 = "Cat B";
			 String o3 = "Mouse C";
			 
			 if(Math.abs(x-z)==Math.abs(y-z)) {
				 return o3;
			 }
			 if(Math.abs(x-z)<Math.abs(y-z)) {
				 return o1;
			 }
			 return o2;

		    }
		 
		 static int[] gradingStudents(int[] grades) {
			 int[] res = new int[grades.length];
			 for(int i=0;i<grades.length;i++) {
				 if(grades[i]<38) {
					 res[i] = grades[i];
				 }else if(grades[i]%10==3||grades[i]%10==8){
					 res[i]=grades[i]+2;
				 }else if(grades[i]%10==4||grades[i]%10==9){
					 res[i]=grades[i]+1;
				 }else {
					 res[i]=grades[i];
				 }
			 }
			 
			 return res;
		 }
		 
		 static int hurdleRace(int k, int[] height) {
			 	int max =0;
			 	int doses;
			 	for(int i=0;i<height.length;i++) {
			 		if(height[i]>max) {
			 			max=height[i];
			 		}
			 	}
			 	doses=max-k;
			 	if(doses<0) {
			 		doses=0;
			 	}
			 	return doses;
		    }
		 
		 static int utopianTree(int n) {
			 int height = 1;
			 for(int i=2;i<n+2;i++) {
				 if(i%2==0) {
					 height*=2;
				 }else {
					 height+=1;
				 }
			 }
			 return height;
		    }
		 
		 static int designerPdfViewer(int[] h, String word) {
			 int max=0;
			 int count = word.length();
			 int area = 0;
			 int currHeight = 0;
			 for(int i=0;i<word.length();i++) {
				 currHeight = h[word.charAt(i)-97];
				 if(currHeight>max) {
					 max=currHeight;
				 }
			 }
			 area = max*count;
			 return area;
		    }
}



