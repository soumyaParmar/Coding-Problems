/* Given an integer n, print all balanced bracket strings of length 2*n.

A bracket string is a string which contains only ( and ) as its characters and for each opening bracket there is a corresponding valid closing bracket. */

public static void printArr(char[] ch){
    for(int i=0;i<ch.length;i++){
      System.out.print(ch[i]);
    }
     System.out.println();
  }
  
  public static void printb(char[] ch, int open, int close, int pos){
    if(open==0 && close==0){
      printArr(ch);
    }
    if(open!=0){
      ch[pos]='(';
      printb(ch,open-1,close,pos+1);
    }
    if(close>open){
      ch[pos]=')';
       printb(ch,open,close-1,pos+1);
    }
