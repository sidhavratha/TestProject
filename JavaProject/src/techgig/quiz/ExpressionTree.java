package techgig.quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class ExpressionTree {

	enum NODE_TYPE{OPERATOR,DIGIT};
	enum OPERATOR_TYPE{PLUS,MINUS,MULTIPLY};
	
	static class TreeNode{
		TreeNode operatorLeft;
		TreeNode operatorRight;
		TreeNode(char operator){
			type = NODE_TYPE.OPERATOR;
			if(operator=='+') this.operator = OPERATOR_TYPE.PLUS;
			else if(operator=='-') this.operator = OPERATOR_TYPE.MINUS;
			else if(operator=='×') this.operator = OPERATOR_TYPE.MULTIPLY;
		}
		TreeNode(int value){
			digit=value;
			type = NODE_TYPE.DIGIT;
		}
		NODE_TYPE type;
		OPERATOR_TYPE operator;
		int digit;
	}
	
	public static void main(String[] args) {
		
		try{
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String expression = "((2+8)*9)-(5*(5+2))";//"{((2+8)*9)-(5*(5+2))}";//br.readLine();
			//expression.replaceAll("{", "(").replaceAll("}", ")");
			expression=expression.replace('{', '(').replace('}', ')');
			System.out.println(expression);
			Stack<Character> brackets = new Stack<Character>();
			Stack<TreeNode> digits = new Stack<TreeNode>();
			Stack<TreeNode> operators = new Stack<TreeNode>();
			boolean isNumber = false;
			int currNumber = 0;
			for(int i=0;i<expression.length();i++){
				char currChar = expression.charAt(i);
				
				try{
					int value = Integer.parseInt(currChar+"");
					if(!isNumber){
						isNumber=true;
						currNumber = value;
					}else{
						currNumber = (currNumber*10)+value;
					}
				}catch(NumberFormatException nfe){
					if(isNumber){
						isNumber=false;
						TreeNode digitNode = new TreeNode(currNumber);
						digits.push(digitNode);
					}
					if(currChar=='('){
						brackets.push(currChar);
					}else if(currChar==')'){
						if(operators.size()>0){
							TreeNode operatorNode = operators.pop();
							operatorNode.operatorRight = digits.pop();
							operatorNode.operatorLeft = digits.pop();
							digits.push(operatorNode);
						}
						brackets.pop();
					}else if(currChar=='+'||currChar=='-'||currChar=='×'||currChar=='*'){
						TreeNode operatorNode = new TreeNode(currChar);
						operators.push(operatorNode);
					}
				}
				//System.out.println("Curr char : "+currChar);
				
			}
			
			if(!operators.isEmpty()){
				if(operators.size()>0){
					TreeNode operatorNode = operators.pop();
					operatorNode.operatorRight = digits.pop();
					operatorNode.operatorLeft = digits.pop();
					digits.push(operatorNode);
				}
			}
			
			//System.out.println("Finished : ");
			//printPreOrder(digits.pop());
			
			System.out.println("Calculated value is : "+postOrderEvaluation(digits.pop()));
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public static void printPreOrder(TreeNode head){
		if(head!=null){
			if(head.type==NODE_TYPE.OPERATOR){
				System.out.print((head.operator==OPERATOR_TYPE.PLUS?"+":(head.operator==OPERATOR_TYPE.MINUS?"-":(head.operator==OPERATOR_TYPE.MULTIPLY?"×":"?")))+" ");
				printPreOrder(head.operatorLeft);
				printPreOrder(head.operatorRight);
			}
			else if(head.type==NODE_TYPE.DIGIT){
				System.out.print(head.digit+" ");
			}
			
		}
	}
	
	
	public static int postOrderEvaluation(TreeNode head){
		if(head!=null){
			
			if(head.type==NODE_TYPE.OPERATOR){
				int left = postOrderEvaluation(head.operatorLeft);
				int right = postOrderEvaluation(head.operatorRight);
				if(head.operator==OPERATOR_TYPE.PLUS){
					return left+right;
				}
				else if(head.operator==OPERATOR_TYPE.MINUS){
					return left-right;
				}
				else if(head.operator==OPERATOR_TYPE.MULTIPLY){
					return left*right;
				}
				System.out.println("Something wrong with operator");
			}
			else if(head.type==NODE_TYPE.DIGIT){
				return head.digit;
			}
			
		}
		System.out.println("Something wrong with node(is null)");
		return 0;
	}

}


