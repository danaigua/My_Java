package JOB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class _10_16_hasmap_study {
	public static void main(String[] args) {
		//hasmap ��ʵ��ԭ��1�����ڹ�ϣ������+����+���������������jdk1.8��
		//Ĭ�ϼ�������Ϊ0.75�����´�������˼������ɢ��
		//Ĭ�ϴ�С��16
		/**
		 * ��ΰѶ���洢�������еģ�
		 * ��key����ͨ��hash()��������hashֵ��Ȼ�������hashֵ�����鳤��ȡ������Ĭ����16����������key����
		 * �������д洢��λ�ã������λ���ж������ʱ������ṹ�洢���������ȴ���8ʱ������ת��Ϊ������ṹ�洢
		 * ��������Ŀ����Ϊ��ȡֵ���죬�洢��������Խ�����ܵı���Խ���ԡ�
		 */
		/**
		 * ���������ԭ���������������75%��˵����������Ҫ������
		 * ������㷨�ǣ���ǰ����<<1���൱�ڳ�2�����������ʱ�������˳����ܻ����¼��㣨hashֵ���¼��㣩���ǳ������ܡ�
		 * �����о���Ҫ������������������������⡣
		 * �̲߳���ȫ���ʺ��ڵ��߳���ʹ��
		 */
		/**
		 * hashmap��hashtable������
		 * hashtable����hash��ʵ�֣�����+����
		 * Ĭ�������С11����������0.75����hashmap��ͬ����hashmap��Node���洢���ݣ�hashtable����entry���洢����
		 * ���䷽ʽ��ԭ�����С<<1(��2)��1
		 * �̰߳�ȫ�����ڶ��̷߳���ʱ���ܸ���
		 */
		/**
		 * linkedHasMap��ʵ����HashMap�Ĳ�֮ͬ������linkedHashMapά����һ��˫��������ɢ�е�ʱ�������¼���hashֵ
		 * linkedhashmap��hashmap������
		 */
		Map<Integer,String> nums = new HashMap<>();
		nums.put(1, "JOB");
		nums.computeIfAbsent(2, (value)->value+"test");//���Ϊ�վ��������
		
		nums.merge(1, "JOB2", (v1,v2)->v1.concat(v2));//����ϲ���1.8����ķ��������Ͻ�
		
		
		nums.forEach((key,value)->System.out.println(key+value));
		//Collections������:����
		//�������
		List<String> list = new ArrayList<>();
		
	}

}
