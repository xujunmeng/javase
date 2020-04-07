package javaMath;

import InheritedGenericClass.泛型方法.类中的泛型方法.Person;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import 重试.RetryUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author junmeng.xu
 * @date 2016年5月12日下午1:46:10
 */
public class Main {

	public static void main(String[] args) {

		Long a = 1l;
		if (a.longValue() >= 1l) {
			System.out.println("adsfasd");
		}

	}

	@Test
	public void testsd() {
		List<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(33);
		list.add(11);
		Integer total = 0;
		for (Integer aa : list) {
			total = total + aa;
		}
		System.out.println(total);
	}

	@Test
	public void tres213() {
		Integer a = 23;
		Integer b = 4;
		Integer c = 5;
		Integer d = 3;
		BigDecimal result1 = BigDecimal.valueOf(a * b * c).divide(BigDecimal.valueOf(d), 2, BigDecimal.ROUND_HALF_UP);
		BigDecimal result2 = BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).multiply(BigDecimal.valueOf(c)).divide(BigDecimal.valueOf(d), 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(result1);
		System.out.println(result2);
	}

	// subtract
	@Test
	public void test() {

		BigDecimal b1 = BigDecimal.valueOf(8.6);
		BigDecimal b2 = BigDecimal.valueOf(7);
		BigDecimal subtract = b1.subtract(b2);
		System.out.println(subtract);
	}

	public static BigDecimal subtract(BigDecimal x, BigDecimal... y) {
		if (x == null)
			x = BigDecimal.ZERO;
		BigDecimal sub = x;
		for (BigDecimal by : y) {
			if (by == null)
				by = BigDecimal.ZERO;
			sub = sub.subtract(by);
		}
		return sub;
	}

	// gt
	@Test
	public void test2() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(4);
		boolean gt = gt(b2, b1);
		System.out.println(gt);
	}

	public static boolean gt(BigDecimal x, BigDecimal y) {
		return !(x == null || y == null) && x.compareTo(y) > 0;
	}

	// min
	@Test
	public void test3() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(4);
		BigDecimal min = min(b1, b2);
		System.out.println(min);
	}

	public static BigDecimal min(BigDecimal x, BigDecimal y) {
		if (x == null || y == null)
			return null;
		return x.compareTo(y) <= 0 ? x : y;
	}

	// max
	@Test
	public void test4() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(4);
		BigDecimal max = max(b1, b2);
		System.out.println(max);
	}

	public static BigDecimal max(BigDecimal x, BigDecimal... y) {
		BigDecimal max = x;
		for (BigDecimal by : y) {
			if (max == null && by == null)
				continue;
			if (max == null) {
				max = by;
				continue;
			}
			if (by == null)
				continue;
			if (max.compareTo(by) < 0)
				max = by;
		}
		return max;
	}

	// max2
	@Test
	public void testMax2() {
		BigDecimal b2 = new BigDecimal(5);
		BigDecimal b3 = new BigDecimal(10);
		BigDecimal b4 = new BigDecimal(5);
		BigDecimal b1 = new BigDecimal(25);
		BigDecimal b5 = new BigDecimal(15);
		BigDecimal b6 = new BigDecimal(20);
		ArrayList<BigDecimal> list = Lists.newArrayList(b1, b2, b3, b4, b5, b6);
		BigDecimal max = max(list);
		System.out.println(max);
	}

	public static <T extends Comparable<? super T>> T max(List<T> data) {
		if (data == null || data.isEmpty())
			return null;
		T max = data.get(0);
		int len = data.size();
		for (int i = 1; i < len; i++) {
			T th = data.get(i);
			if (th != null && max != null && th.compareTo(max) == 1)
				max = th;
		}
		return max;
	}

	// eq
	@Test
	public void test5() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(23);
		boolean eq = eq(b1, b2);
		System.out.println(eq);
	}

	public static boolean eq(BigDecimal x, BigDecimal y) {
		if (x == null && y == null)
			return true;
		if (x == null || y == null)
			return false;
		return x.compareTo(y) == 0;
	}

	// add
	@Test
	public void test6() {
		BigDecimal b1 = new BigDecimal(2.32);
		BigDecimal b2 = new BigDecimal(2.32);
		BigDecimal b3 = new BigDecimal(2.32);
		double v = b1.add(b2).subtract(b3).doubleValue();
		System.out.println(v);
	}

	public static BigDecimal add(BigDecimal x, BigDecimal... y) {
		if (x == null)
			x = BigDecimal.ZERO;
		BigDecimal sum = x;
		for (BigDecimal by : y) {
			if (by == null)
				by = BigDecimal.ZERO;
			sum = sum.add(by);
		}
		return sum;
	}

	// divide
	@Test
	public void test7() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(23);
		BigDecimal divide = divide(b1, b2);
		System.out.println(divide);
	}

	public static BigDecimal divide(BigDecimal x, BigDecimal y) {
		return divide(x, y, 4, RoundingMode.HALF_UP);
	}

	public static BigDecimal divide(BigDecimal x, BigDecimal y, int scale,
			RoundingMode roundingMode) {
		if (x == null || y == null)
			return null;
		if (BigDecimal.ZERO.compareTo(y) == 0)
			return null;
		return x.divide(y, scale, roundingMode);
	}

	// multiply
	@Test
	public void test8() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(23);
		BigDecimal multiply = multiply(b1, b2);
		System.out.println(multiply);
	}

	public static BigDecimal multiply(BigDecimal x, BigDecimal... y) {
		if (x == null)
			return null;
		BigDecimal rt = x;
		for (BigDecimal by : y) {
			if (by == null)
				return null;
			rt = rt.multiply(by);
		}
		return rt;
	}

	// lte
	@Test
	public void test9() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(21);
		boolean lte = lte(b1, b2);
		System.out.println(lte);
	}

	public static boolean lte(BigDecimal x, BigDecimal y) {
		return !(x == null || y == null) && x.compareTo(y) <= 0;
	}

	// sum
	@Test
	public void test10() {
		BigDecimal b1 = new BigDecimal(23);
		BigDecimal b2 = new BigDecimal(21);
		List<BigDecimal> list = Lists.newArrayList(b1, b2);
		BigDecimal sum = sum(list);
		System.out.println(sum);
	}

	public static BigDecimal sum(Collection<? extends Number> array) {
		if (array == null || array.isEmpty())
			return BigDecimal.ZERO;
		BigDecimal sum = BigDecimal.ZERO;
		for (Number bd : array) {
			if (bd != null) {
				if (bd instanceof Double
						&& (((Double) bd).isNaN() || ((Double) bd).isInfinite())) {
					continue;
				}
				sum = sum.add(new BigDecimal(bd.doubleValue()));
			}
		}
		return sum.setScale(8, RoundingMode.HALF_UP);
	}

	// add 原生的
	@Test
	public void test33() {
		BigDecimal pg = new BigDecimal(30);
		BigDecimal pz = new BigDecimal(30);
		BigDecimal ph = new BigDecimal(40);

		int compareTo = pg.add(pz).add(ph).compareTo(new BigDecimal(100));
		if (compareTo == 0) {
			System.out.println(compareTo);
		}
		BigDecimal divide = pg.add(pz).add(ph).divide(new BigDecimal(20));
		System.out.println(divide);
	}

	@Test
	public void test2324e() {
		BigDecimal b1 = new BigDecimal(new Float(0.1541));
		System.out.println(b1);
	}
	@Test
	public void test234() {
		float a = 9999999.0f;
		System.out.println(a);
	}

	@Test
	public void tres23() {
		BigDecimal b1 = new BigDecimal(25);
		BigDecimal b2 = new BigDecimal(5);
		BigDecimal divide = b1.subtract(b2);
		boolean a = divide.intValue() > 0;
		System.out.println(a);
	}

	// substract divide
	@Test
	public void testSubDiv() {
		BigDecimal b1 = new BigDecimal(25);
		BigDecimal b2 = new BigDecimal(5);

		
		System.out.println(subtract(b1, b2).divide(b2));

		BigDecimal bigDecimal = null;
		if (ObjectUtils.equals(null, bigDecimal)) {
			System.out.println("asdf");
		}

	}
	
	@Test
	public void testsubtract(){
		if(true && false){
			System.out.println("1111");
		}
		if(false && false){
			System.out.println("2222");
		}
		if(false && true){
			System.out.println("33333");
		}
		if(true && true){
			System.out.println("4444");
		}
	}
	
	
	//compareTo  比较的时候，一定要两个的精度都是一样的！！！
	@Test
	public void testcompareTo(){
		BigDecimal b1 = new BigDecimal(0.2000);
		BigDecimal b2 = new BigDecimal(0.2);

		BigDecimal b3 = new BigDecimal(0);
		BigDecimal b4 = new BigDecimal(0.0000);
		
		BigDecimal b5 = new BigDecimal(1.0000);
		BigDecimal b6 = new BigDecimal(1);
		int compareTo = b1.compareTo(b2);
		int compareTo2 = b3.compareTo(b4);
		int compareTo3 = b5.compareTo(b6);
		System.out.println(compareTo);
		System.out.println(compareTo2);
		System.out.println(compareTo3);
		
	}
	
	@Test
	public void testSub(){
		ArrayList<Integer> list = Lists.newArrayList(12,45,5,2,4,5,56,4,3,3);
		System.out.println(list.subList(0, 9));
		System.out.println(list.subList(1, 10));
		
	}
	
	//sum
	@Test
	public void test22() {
		ArrayList<BigDecimal> closes = Lists.newArrayList(new BigDecimal(25), new BigDecimal(5));
		BigDecimal sum = new BigDecimal(0);
		for (int i = 0; i < 2; i++) {
			sum = sum.add(closes.get(i));
		}
		BigDecimal divide = sum.divide(new BigDecimal(2));
		System.out.println(divide);
	}

	//复杂运算
	@Test
	public void test22222(){
		BigDecimal b1 = new BigDecimal(5);
		BigDecimal b2 = new BigDecimal(15);
		BigDecimal b3 = new BigDecimal(20);
		BigDecimal b4 = new BigDecimal(25);
		BigDecimal b5 = new BigDecimal(30);
		BigDecimal b6 = new BigDecimal(60);
		
		BigDecimal divide = new BigDecimal(100).multiply(b6).divide(b1.add(b2));
		
		System.out.println(divide);
	}
	
	//平方
	@Test
	public void testss(){
		BigDecimal b1 = new BigDecimal(5);
		BigDecimal b2 = new BigDecimal(15);
		double sqrt = Math.pow(b2.doubleValue(), 2);
		System.out.println(sqrt);
	}
	@Test
	public void testlll(){
		BigDecimal b1 = new BigDecimal(35.68);
		BigDecimal b2 = new BigDecimal(19.58);
		BigDecimal divide = b1.subtract(b2).divide(b2);
		System.out.println(divide);
	}

	@Test
	public void test2342() {
		BigDecimal a = BigDecimal.valueOf(0.1);
		System.out.println(a);
		Integer bb = new BigDecimal(0.3).intValue();
		System.out.println(bb);
	}
	
	//std
	@Test
	public void teststd(){
		ArrayList<BigDecimal> list = Lists.newArrayList();
		list.add(new BigDecimal(15.0));
		list.add(new BigDecimal(14.55));
		list.add(new BigDecimal(14.555));
		list.add(new BigDecimal(14.665));
		list.add(new BigDecimal(14.525));
		list.add(new BigDecimal(14.005));
		list.add(new BigDecimal(13.955));
		list.add(new BigDecimal(14.025));
		list.add(new BigDecimal(14.135));
		list.add(new BigDecimal(14.155));
		list.add(new BigDecimal(14.195));
		list.add(new BigDecimal(13.975));
		list.add(new BigDecimal(14.115));
		list.add(new BigDecimal(14.095));
		list.add(new BigDecimal(14.195));
		list.add(new BigDecimal(13.955));
		list.add(new BigDecimal(13.405));
		list.add(new BigDecimal(13.705));
		list.add(new BigDecimal(13.475));
		list.add(new BigDecimal(13.295));
		list.add(new BigDecimal(13.445));
		list.add(new BigDecimal(13.525));
		list.add(new BigDecimal(13.085));
		list.add(new BigDecimal(13.245));
		list.add(new BigDecimal(12.975));
		list.add(new BigDecimal(12.955));
		list.add(new BigDecimal(13.585));
		list.add(new BigDecimal(13.575));
		list.add(new BigDecimal(13.755));
		list.add(new BigDecimal(13.725));
		BigDecimal sTD = sTD(list, list.size());
		System.out.println(sTD);
	}
	
	//refMa
	@Test
	public void testRefMa(){
		ArrayList<BigDecimal> list = Lists.newArrayList();
		list.add(new BigDecimal(2));
		list.add(new BigDecimal(4));
		list.add(new BigDecimal(6));
		list.add(new BigDecimal(8));
		list.add(new BigDecimal(10));
		list.add(new BigDecimal(12));
		list.add(new BigDecimal(14));
		list.add(new BigDecimal(16));
		list.add(new BigDecimal(18));
		
		BigDecimal ref = ref(list, 9);
		System.out.println(ref);
		
//		int n = 5;
//		int m = 1;
//		refMa(list, n, m);
	}
	public BigDecimal ref(ArrayList<BigDecimal> list, int n){
		if((list.size() >= n) && (n >= 0)){
			return list.get(n);
		}
		return null;
	}
	public BigDecimal refMa(List<BigDecimal> list, int n, int m){
		int limit = n + m;
		if(list.size() >= limit){
			return MA(list.subList(m, limit), n);
		}
		return null;
	}
	public BigDecimal MA(List<BigDecimal> list, int n){
		BigDecimal sum = new BigDecimal(0);
		for (int i = 0; i < n; i++) {
			sum = sum.add(list.get(i));
		}
		return divide(sum, new BigDecimal(n), 4, RoundingMode.HALF_UP);
		
	}
	
	public BigDecimal sTD(List<BigDecimal> list, int n){
		BigDecimal average = average(list.subList(0, n));
		double sum = 0l;
		for (BigDecimal obj : list) {
			sum += Math.pow(obj.subtract(average).doubleValue(), 2);
		}
		return divide(BigDecimal.valueOf(sum), new BigDecimal(n));
	}
	
    public static BigDecimal average(Collection<BigDecimal> array) {
        return average(array, 4, RoundingMode.HALF_UP);
    }
    
    public static BigDecimal average(Collection<BigDecimal> array, int scale, RoundingMode roundingMode) {
        if (array == null || array.isEmpty())
            return BigDecimal.ZERO;
        return divide(sum(Lists.newArrayList(array)), new BigDecimal(array.size()), scale, roundingMode);
    }

	@Test
	public void serser() {
		String str = "32.0";
		BigDecimal bigDecimal = new BigDecimal(str);
		System.out.println(bigDecimal);
	}

	@Test
	public void tgadfadsf() {
		BigDecimal a = BigDecimal.valueOf(0);

		a = a.add(BigDecimal.valueOf(33));

		System.out.println(a.add(BigDecimal.valueOf(22)));

	}

	@Test
	public void tesxvdsvf() {
		List<Integer> payBalanceNotEnough = Lists.newArrayList(10100007, 13111086);

		Integer a = 10100007;
		boolean contains = payBalanceNotEnough.contains(a);
		System.out.println(contains);
	}

	@Test
	public void tesr23() {
		BigDecimal a = BigDecimal.valueOf(0);
		int i = a.intValue();
		System.out.println(i);
	}

	@Test
	public void tresr() {
		StringBuffer sb = new StringBuffer();

		String ALLNUMBER = "1234567890";

		SecureRandom random = new SecureRandom();
		for (int i = 0; i < 6; i++) {
			sb.append(ALLNUMBER.charAt(random.nextInt(ALLNUMBER.length())));
		}
		String s = sb.toString();
	}

	@Test
	public void awer() {
		for (int i = 0; i < 100; i++) {
			int m = (int)(Math.random()*900 + 100);
			System.out.println(m);
		}

	}

	@Test
	public void seraser() {
		List<Person> list = Lists.newArrayList();
		Map<String, Person> collect = list.stream().collect(Collectors.toMap(a -> a.getName(), b -> b));
		System.out.println(collect);
		if (null != collect) {
			System.out.println(collect);
		}
	}

	@Test
	public void tsetr234() throws Exception {
		int a  = 3;
		RetryUtil.executeWithRetry(() -> {
			try {
				System.out.println(a);
				int b = 1/0;
			} catch (Exception e) {
				return false;
			}
			return true;
		}, true, 10, 3000L);
	}

	@Test
	public void wseras() {
		BigDecimal totalSaleAmount = new BigDecimal(10008.00).setScale(2, BigDecimal.ROUND_DOWN);

		BigDecimal violateProportionValue = new BigDecimal(0.02).setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal violateAmount = totalSaleAmount.multiply(violateProportionValue).setScale(0, BigDecimal.ROUND_DOWN);

		BigDecimal bb = new BigDecimal(50).setScale(0, BigDecimal.ROUND_DOWN);
		if(violateAmount.compareTo(bb) < 0){
			System.out.println(bb);
		}else {
			System.out.println(violateAmount);
		}
	}

	@Test
	public void asdfasdf() {
		BigDecimal a = new BigDecimal(0.02).setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println(a);

		BigDecimal b = BigDecimal.valueOf(0.02).setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println(b);
	}

	@Test
	public void saefsdf() {
		List<AAA> aList = Lists.newArrayList();
		aList.add(new AAA(1, BigDecimal.valueOf(32.4)));
		aList.add(new AAA(2, BigDecimal.valueOf(32.4)));
		aList.add(new AAA(2, null));

		BigDecimal reduce = aList.stream().map(a -> a.getA()).filter(a -> a != null).reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(reduce);
	}

	class AAA {
		private Integer id;
		private BigDecimal a;

		public AAA(Integer id, BigDecimal a) {
			this.id = id;
			this.a = a;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public BigDecimal getA() {
			return a;
		}

		public void setA(BigDecimal a) {
			this.a = a;
		}
	}

}
