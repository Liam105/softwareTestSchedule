import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {
	private Work myWorkA = new Work("A",10,30);
	private Work myWorkB = new Work("B",10,40);
	private Work myWorkC = new Work("C",20,10);
	private Work myWorkD = new Work("D",30,20);
	private List<Work> workList = new ArrayList<Work>();
	private List<Work> sortWorkList = new ArrayList<Work>();
	private List<Double> resultSJF = new ArrayList<Double>();
	private List<Double> result = new ArrayList<Double>();
	private List<Double> resultFCFS = new ArrayList<Double>();
	private Schedule myTest = new Schedule();
	@Before
	public void setUp() throws Exception {
		workList.add(myWorkA);
		workList.add(myWorkB);
		workList.add(myWorkC);
		workList.add(myWorkD);
		sortWorkList.add(myWorkC);
		sortWorkList.add(myWorkD);
		sortWorkList.add(myWorkA);
		sortWorkList.add(myWorkB);
		resultFCFS.add((double) 62.5);
		resultFCFS.add((double) 3.4375);
		resultSJF.add((double)50);
		resultSJF.add((double)2.125);
		
	}

	@Test
	public void testFCFS() {
		result = myTest.FCFS(workList);
		System.out.println("FCFS");
		for(double i : result){
			System.out.println(i);
		}
	}

	@Test
	public void testSJF() {
		result = myTest.SJF(workList);
		System.out.println("SJF");
		for(double i : result){
			System.out.println(i);
		}
	}

	@Test
	public void testSortByServiceTime() {
		assertEquals(sortWorkList,myTest.sortByServiceTime(workList));
	}

}
