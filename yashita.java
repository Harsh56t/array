class Newll{
  public static class Node{
    int data;
    Node link;
    Node(int data){
      this.data = data;
    }
  }
  public static class Codes{ //Data Structure starts
    Node head =null;  
    Node tail = null;
void at_end(int val){  // First method define
Node temp = new Node(val);
    if(head==null){
      head = temp;
                        //9-> 4->6->1->8
    }
    else{
      tail.link = temp;
      
    }
    tail = temp;
    }
    void display(){     // display method define
      Node temp = head;
      while(temp!=null){
     System.out.print(temp.data+" ");
      temp = temp.link;
      
      }
      
    }
    void at_start(int val){   // at_end method define
     Node temp = new Node(val);
     if(head==null){
      head = temp;
      tail = temp;
     }
     else{
      temp.link = head;
      head = temp;
     }
     
    }
    void at_between(int idx , int val ){
      Node x = new Node(val);
      Node temp = head;
      for( int i=1;i<= idx-1;i++){
        temp = temp.link;
      }
      x.link = temp.link;
      temp.link = x;
    }
} // Data Structure Complete
  
public static void main(String[] args) {
    Codes cds = new Codes();
    cds.at_end(8); // 8
    cds.at_end(14); // 8->14
    
   cds.at_start(9); // 9->8->14
   cds.at_start(5);// 5->9->6->8->14
  //  cds.display();
    cds.at_between(1, 6); // 9->6->8->14
    cds.display();
    

}
       
}
    