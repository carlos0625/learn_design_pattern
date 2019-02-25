package behavioral.interpreter;

import java.util.Stack;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:26
 * Description: 指令处理类，工具类，提供相应的方法对输入指令进行处理。
 */
public class InstructionHandler {
    private static final String AND = "and";
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null;
        AbstractNode right = null;
        AbstractNode direction = null;
        AbstractNode action = null;
        AbstractNode distance = null;

        //用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();

        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word1 = null;

            //如果遇到and，则将其后的3个单词作为3个终结符表达式连成一个简单句子SentenceNode作为"add"的右表达式，
            //而将从栈顶弹出的表达式作为and的左表达式，最后将新的"and"表达式压入栈中.
            if (words[i].equalsIgnoreCase(AND)) {
                left = (AbstractNode) stack.pop();
                word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            }
            //如果是从头开始进行解释，则将3个单词组成一个简单句子SentenceNode并将该句子压入栈中
            else {
                word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = (AbstractNode) stack.pop();
    }

    public String output() {
        return node.interpret();
    }
}
