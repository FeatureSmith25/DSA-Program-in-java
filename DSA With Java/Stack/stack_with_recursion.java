import java.util.Stack;
public class stack_with_recursion {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int ele = 60;
        System.out.print(st);
        pushatbottom(st,ele); 
    }
    public static void Reverse(Stack<Integer>st){
        int top = st.pop();
        Reverse(st);
        pushatbottom(st, top);
    }
    public static void pushatbottom(Stack<Integer>st, int ele){
        if(st.size()==0){
            st.push(ele);
            return; 
        }
        int top=st.pop();
        pushatbottom(st, ele);
        st.push(top);
    }
} 