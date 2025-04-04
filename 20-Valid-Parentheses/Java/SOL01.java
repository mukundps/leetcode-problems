class Solution {
    public boolean isValid(String s) {
      char[] arr = s.toCharArray();
      Stack<Character> stack = new Stack<Character>();
      int index = 0;
      if(arr.length == 1)
          return false;
      if(s == "")
          return true;
      while(index < arr.length){
          if(stack.isEmpty() || arr[index] == '(' || arr[index] == '{' || arr[index] == '[')
              stack.push(arr[index]);
          else if (arr[index] == ')' && stack.peek() == '(' || arr[index] == ']' && stack.peek() == '[' || arr[index] == '}' && stack.peek() == '{')
              stack.pop();
          else
              return false;
          index+=1;
      }
      if(!stack.isEmpty())
          return false;
      return true;
    }
}
