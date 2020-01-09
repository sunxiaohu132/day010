package com.sxh.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deam {
	
	public static void main(String[] args) {
		String str="* Because TreeNodes are about twice the size of regular nodes, we"+
			    " * use them only when bins contain enough nodes to warrant use"+
			    " * (see TREEIFY_THRESHOLD). And when they become too small (due to"+
			    "  * removal or resizing) they are converted back to plain bins.  In"+
			    "  * usages with well-distributed user hashCodes, tree bins are"+
			    "  * rarely used.  Ideally, under random hashCodes, the frequency of"+
			    "  * nodes in bins follows a Poisson distribution"+
			    "  * (http://en.wikipedia.org/wiki/Poisson_distribution) with a"+
			    "  * parameter of about 0.5 on average for the default resizing"+
			    "  * threshold of 0.75, although with a large variance because of"+
			    "  * resizing granularity. Ignoring variance, the expected"+
			    "  * occurrences of list size k are (exp(-0.5) * pow(0.5, k) /"+
			    "   * factorial(k)). The first values are";
		
		
		/**
		 *  1、自定义一个结构，利用hashMap 统计字符出现的次数。
			2、至少使用两种遍历方式打印每个字母出现的次数。
			3、统计每个单词出现的次数。然后遍历打印。
			4、打印出现次数超过3次的单词（大小写不敏感）。
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Pattern matcher = Pattern.compile("\\b[a-zA-Z]+\\b");
		Matcher mat = matcher.matcher(str);
		while(mat.find()){
			String group = mat.group();
			if(!map.containsKey(group)){
				map.put(group, 1);
			}else{
				map.put(group, map.get(group)+1);
			}
		}
		
		for (int i=0;i<str.length();i++){
			String a = str.charAt(i)+"";
			if(!map.containsKey(a)){
				map.put(a, 1);
			}else{
				map.put(a, map.get(a)+1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getKey().matches("[a-zA-Z]+") &&entry.getValue()>3){
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
}
