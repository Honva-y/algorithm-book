package com.honva;

import java.util.LinkedList;

/**
 * Description 字符串解码
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 *
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 *
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 *
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 *
 * 示例:
 *
 * s = "3[a]2[bc]", 返回 "aaabcbc".
 * s = "3[a2[c]]", 返回 "accaccacc".
 * s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-string
 *
 * 辅助栈法
 * @Author honva
 * @Date 2020/5/14
 **/
public class StringEnc {
    public static void main(String[] args) {

    }
    public static String sulotion(String str){
        LinkedList<Integer> nums = new LinkedList<>();
        LinkedList<String> strings = new LinkedList<>();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if(c.equals("[")){
                nums.addLast(num);
                strings.addLast(sb.toString());
                num = 0;
                sb.setLength(0);
            }else if(c.equals("]")){

            }else if(c>'0' && c<'9'){
                num = num*10+Integer.parseInt(c.toString());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
