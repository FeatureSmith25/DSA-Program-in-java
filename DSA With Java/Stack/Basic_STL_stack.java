import java.util.Stack;
public class Basic_STL_stack {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
        st.push("Hardik");
        st.push("Aman");
        st.push("Abhay");

        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}