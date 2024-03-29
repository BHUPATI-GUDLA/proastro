package com.proastro.gua.insertScript;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proastro.gua.entities.Master;
import com.proastro.gua.entities.Stems;
import com.proastro.gua.enums.BranchEnum;
import com.proastro.gua.enums.DayEnum;
import com.proastro.gua.enums.MonthEnum;
import com.proastro.gua.enums.StemsEnum;
import com.proastro.gua.enums.YearEnum;
import com.proastro.gua.repo.MasterRepo;
import com.proastro.gua.repo.StemsRepo;

/**
 * @author bgudla
 * 
 */
@Component
public class InsertScript {

	@Autowired
	StemsRepo StemsRepo;
	
	@Autowired
	MasterRepo masterRepo;
	
	public void storeRecordInStems() {
		
		List<Stems> allRecords = new ArrayList<>();
		


		
		
		
		StemsRepo.saveAll(allRecords);
		

		
		
	}
	
	public void storeRecordInMaster() {
		
		List<Master> masters = new ArrayList<>();
	
//		Jan
		Master master1 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 01, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Mon.getValue());
		Master master2 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 02, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Tue.getValue());
		Master master3 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 03, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Wed.getValue());
		Master master4 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 04, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Thu.getValue());
		Master master5 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 05, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Fri.getValue());
		Master master6 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 06, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sat.getValue());
		Master master7 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 07, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sun.getValue());
		Master master8 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 8, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Mon.getValue());
		Master master9 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 9, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Tue.getValue());
		Master master10 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 10, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.You.getValue(), DayEnum.Wed.getValue());
		Master master11= new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 11, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Thu.getValue());
		Master master12 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 12, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Fri.getValue());
		Master master13 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 13, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sat.getValue());
		Master master14 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 14, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sun.getValue());
		Master master15 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 15, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Mon.getValue());
		Master master16 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 16, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Tue.getValue());
		Master master17 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 17, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Wed.getValue());
		Master master18 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 18, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Thu.getValue());
		Master master19 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 19, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Fri.getValue());
		Master master20 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 20, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sat.getValue());
		Master master21= new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 21, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sun.getValue());
		Master master22 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 22, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.You.getValue(), DayEnum.Mon.getValue());
		Master master23 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 23, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Tue.getValue());
		Master master24 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 24, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());
		Master master25 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 25, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Thu.getValue());
		Master master26 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 26, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Fri.getValue());
		Master master27 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 27, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sat.getValue());
		Master master28 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 28, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sun.getValue());
		Master master29 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 29, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Mon.getValue());
		Master master30 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 30, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Tue.getValue());
		Master master31 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 31, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Wed.getValue());

//  FEB
		Master master32 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 01, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Thu.getValue());
		Master master33 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 02, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Fri.getValue());
		Master master34 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 03, StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Chou.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sat.getValue());
		Master master35 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 04, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sun.getValue());				
		Master master36 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 05, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Mon.getValue());		
		Master master37 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 06, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Tue.getValue());	
		Master master38 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 07, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Wed.getValue());
		Master master39 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Thu.getValue());
		Master master40 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Fri.getValue());
		Master master41 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sat.getValue());
		Master master42 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sun.getValue());		
		Master master43 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Mon.getValue());	
		Master master44 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Tue.getValue());
		Master master45 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Wed.getValue());
		Master master46 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.You.getValue(), DayEnum.Thu.getValue());
		Master master47 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Fri.getValue());
		Master master48 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sat.getValue());
		Master master49 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sun.getValue());
		Master master50 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Mon.getValue());
		Master master51 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Tue.getValue());
		Master master52 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Wed.getValue());		
		Master master53 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Thu.getValue());	
		Master master54 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Fri.getValue());
		Master master55 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sat.getValue());
		Master master56 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sun.getValue());
		Master master57 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Mon.getValue());
		Master master58 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.You.getValue(), DayEnum.Tue.getValue());
		Master master59 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Wed.getValue());
		Master master60 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Feb.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Thu.getValue());
		
//MARCH		
		
		Master master61 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Fri.getValue());	
		Master master62 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sat.getValue());
		Master master63 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sun.getValue());
		Master master64 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Yin.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Mon.getValue());
		Master master65 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Tue.getValue());	
		Master master66 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Wed.getValue());
		Master master67 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Thu.getValue());	
		Master master68 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Fri.getValue());	
		Master master69 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sat.getValue());	
		Master master70 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sun.getValue());					
		Master master71 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Mon.getValue());	
		Master master72 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Tue.getValue());		
		Master master73 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Wed.getValue());
		Master master74 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Thu.getValue());	
		Master master75 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());	
		Master master77 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sat.getValue());	
		Master master76 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sun.getValue());					
		Master master78 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Mon.getValue());	
		Master master79 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Tue.getValue());		
		Master master80 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Wed.getValue());
		Master master81 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Thu.getValue());	
		Master master82 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.You.getValue(), DayEnum.Fri.getValue());		
		Master master83 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sat.getValue());
		Master master84 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sun.getValue());	
		Master master85 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Mon.getValue());	
		Master master86 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Tue.getValue());	
		Master master87 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Wed.getValue());					
		Master master88 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Thu.getValue());	
		Master master89 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Fri.getValue());		
		Master master90 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sat.getValue());
		Master master91 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Mar.getValue(), 31, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sun.getValue());		

// APRIl

		Master master92 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Mon.getValue());	
		Master master93 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Tue.getValue());	
		Master master94 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(), BranchEnum.Mao.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.You.getValue(), DayEnum.Wed.getValue());	
		Master master95 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Thu.getValue());
		Master master96 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Fri.getValue());
		Master master97 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sat.getValue());	
		Master master98 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sun.getValue());	
		Master master99 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Mon.getValue());
		Master master100 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Tue.getValue());	
		Master master101 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Wed.getValue());	
		Master master102 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Thu.getValue());
		Master master103 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Fri.getValue());
		Master master104 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sat.getValue());	
		Master master105 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sun.getValue());	
		Master master106 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.You.getValue(), DayEnum.Mon.getValue());
		Master master107 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Tue.getValue());	
		Master master108 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());
		Master master109 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Thu.getValue());	
		Master master110 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());
		Master master111 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sat.getValue());	
		Master master112 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sun.getValue());
		Master master113 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Mon.getValue());
		Master master114 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Tue.getValue());	
		Master master115 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Wed.getValue());	
		Master master116 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Thu.getValue());
		Master master117 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Fri.getValue());	
		Master master118 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sat.getValue());
		Master master119 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sun.getValue());	
		Master master120 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Hai.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Mon.getValue());
		Master master121 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Apr.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Tue.getValue());	


// MAY

		Master master122 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Wed.getValue());
		Master master123 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Thu.getValue());	
		Master master124 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Mao.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());
		Master master125 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(), BranchEnum.Chen.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sat.getValue());	
		Master master126 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sun.getValue());
		Master master127 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Mon.getValue());
		Master master128 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Tue.getValue());
		Master master129 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Wed.getValue());
		Master master130 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.You.getValue(), DayEnum.Thu.getValue());
		Master master131 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Fri.getValue());
		Master master132 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sat.getValue());
		Master master133 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sun.getValue());
		Master master134 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Mon.getValue());
		Master master135 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Tue.getValue());
		Master master136 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Wed.getValue());
		Master master137 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Thu.getValue());
		Master master138 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Fri.getValue());
		Master master139 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sat.getValue());
		Master master140 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sun.getValue());
		Master master141 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Mon.getValue());
		Master master142 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.You.getValue(), DayEnum.Tue.getValue());
		Master master143 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Wed.getValue());
		Master master144 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Thu.getValue());
		Master master145 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Fri.getValue());
		Master master146 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sat.getValue());
		Master master147 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sun.getValue());
		Master master148 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Mon.getValue());
		Master master149 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Tue.getValue());
		Master master150 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Wed.getValue());
		Master master151 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Thu.getValue());
		Master master152 = new Master(1, YearEnum.Year.getValue(), MonthEnum.May.getValue(), 31, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Fri.getValue());
		
// june

		Master master153 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sat.getValue());
		Master master154 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sun.getValue());
		Master master155 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Mon.getValue());
		Master master156 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ji.getValue(), BranchEnum.Si.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Tue.getValue());
		Master master157 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Wed.getValue());
		Master master158 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Thu.getValue());
		Master master159 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());
		Master master160 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sat.getValue());
		Master master161 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sun.getValue());
		Master master162 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Mon.getValue());
		Master master163 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Tue.getValue());
		Master master164 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Wed.getValue());
		Master master165 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Thu.getValue());
		Master master166 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.You.getValue(), DayEnum.Fri.getValue());
		Master master167 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sat.getValue());
		Master master168 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sun.getValue());
		Master master169 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Mon.getValue());
		Master master170 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Tue.getValue());
		Master master171 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Wed.getValue());
		Master master172 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Thu.getValue());
		Master master173 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Wed.getValue());
		Master master174 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Thu.getValue());
		Master master175 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Fri.getValue());
		Master master176 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sat.getValue());
		Master master177 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sun.getValue());
		Master master178 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.You.getValue(), DayEnum.Mon.getValue());
		Master master179 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Tue.getValue());
		Master master180 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());
		Master master181 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Thu.getValue());
		Master master182 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jun.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Fri.getValue());
		

//July

		Master master183 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());
		Master master184 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Fri.getValue());
		Master master185 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Fri.getValue());
		Master master186 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Fri.getValue());
		Master master187 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Fri.getValue());
		Master master188 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sat.getValue());
		Master master189 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sun.getValue());
		Master master190 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.You.getValue(), DayEnum.Mon.getValue());
		Master master191 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Tue.getValue());
		Master master192 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());
		Master master193 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Thu.getValue());
		Master master194 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Fri.getValue());
		Master master195 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sat.getValue());
		Master master196 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sun.getValue());
		Master master197 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Mon.getValue());
		Master master198 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Tue.getValue());
		Master master199 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Wed.getValue());
		Master master200 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Thu.getValue());
		Master master201 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Fri.getValue());
		Master master202 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sat.getValue());
		Master master203 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sun.getValue());
		Master master204 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Mon.getValue());
		Master master205 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Tue.getValue());
		Master master206 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Wed.getValue());
		Master master207 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Thu.getValue());
		Master master208 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Geng.getValue(), BranchEnum.Wu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Fri.getValue());
		Master master209 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sat.getValue());
		Master master210 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sun.getValue());
		Master master211 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Mon.getValue());
		Master master212 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Tue.getValue());
		Master master213 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jul.getValue(), 31, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Wed.getValue());

//august


		Master master214 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.You.getValue(), DayEnum.Thu.getValue());
		Master master215 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Fri.getValue());
		Master master216 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sat.getValue());
		Master master217 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sun.getValue());
		Master master218 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Mon.getValue());
		Master master219 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Tue.getValue());
		Master master220 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Wed.getValue());
		Master master221 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Thu.getValue());
		Master master222 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Fri.getValue());
		Master master223 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sat.getValue());
		Master master224 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sun.getValue());
		Master master225 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Mon.getValue());
		Master master226 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.You.getValue(), DayEnum.Tue.getValue());
		Master master227 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Wed.getValue());
		Master master228 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Thu.getValue());
		Master master229 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Fri.getValue());
		Master master230 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sat.getValue());
		Master master231 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sun.getValue());
		Master master232 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Mon.getValue());
		Master master233 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Tue.getValue());
		Master master234 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Wed.getValue());
		Master master235 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Thu.getValue());
		Master master236 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Fri.getValue());
		Master master237 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sat.getValue());
		Master master238 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sun.getValue());
		Master master239 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Xin.getValue(), BranchEnum.Wei.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Mon.getValue());
		Master master240 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Tue.getValue());
		Master master241 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Wed.getValue());
		Master master242 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Thu.getValue());
		Master master243 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());		
		Master master244 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Aug.getValue(), 31, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sat.getValue());

//Spetmeber

		Master master245 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sun.getValue());
		Master master246 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Mon.getValue());
		Master master247 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Tue.getValue());
		Master master248 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Wed.getValue());
		Master master249 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Thu.getValue());
		Master master250 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Ren.getValue(), BranchEnum.Shen.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.You.getValue(), DayEnum.Fri.getValue());
		Master master251 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sat.getValue());
		Master master252 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sun.getValue());
		Master master253 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Mon.getValue());
		Master master254 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Tue.getValue());
		Master master255 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Wed.getValue());
		Master master256 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Thu.getValue());
		Master master257 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Fri.getValue());
		Master master258 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sat.getValue());
		Master master259 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sun.getValue());
		Master master260 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Mon.getValue());
		Master master261 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Tue.getValue());
		Master master262 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.You.getValue(), DayEnum.Wed.getValue());
		Master master263 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Thu.getValue());
		Master master264 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Fri.getValue());
		Master master265 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sat.getValue());
		Master master266 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sun.getValue());
		Master master267 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Mon.getValue());
		Master master268 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Tue.getValue());
		Master master269 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Wed.getValue());
		Master master270 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Si.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Thu.getValue());
		Master master271 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Fri.getValue());
		Master master272 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sat.getValue());
		Master master273 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sun.getValue());
		Master master274 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Sep.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.You.getValue(), DayEnum.Mon.getValue());


//October

		Master master275 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Tue.getValue());
		Master master276 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());
		Master master277 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Thu.getValue());
		Master master278 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Fri.getValue());
		Master master279 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sat.getValue());
		Master master280 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sun.getValue());
		Master master281 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Gui.getValue(), BranchEnum.You.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Mon.getValue());
		Master master282 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Tue.getValue());
		Master master283 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Wed.getValue());	
		Master master284 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Thu.getValue());	
		Master master285 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Fri.getValue());
		Master master286 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sat.getValue());	
		Master master287 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sun.getValue());
		Master master288 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Mon.getValue());
		Master master289 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Tue.getValue());	
		Master master290 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Wed.getValue());
		Master master291 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Thu.getValue());
		Master master292 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Fri.getValue());	
		Master master293 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sat.getValue());
		Master master294 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sun.getValue());
		Master master295 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Mon.getValue());
		Master master296 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Tue.getValue());	
		Master master297 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Wed.getValue());
		Master master298 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.You.getValue(), DayEnum.Thu.getValue());
		Master master299 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Fri.getValue());	
		Master master300 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sat.getValue());
		Master master301 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sun.getValue());
		Master master302 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Mon.getValue());	
		Master master303 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Tue.getValue());
		Master master304 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Wed.getValue());
		Master master305 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Oct.getValue(), 31, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Thu.getValue());
		

//November

		Master master306 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Fri.getValue());
		Master master307 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sat.getValue());
		Master master308 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sun.getValue());
		Master master309 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Mon.getValue());
		Master master310 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.You.getValue(), DayEnum.Tue.getValue());
		Master master311 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Jia.getValue(), BranchEnum.Xu.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Wed.getValue());
		Master master312 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Thu.getValue());	
		Master master313 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Fri.getValue());	
		Master master314 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sat.getValue());
		Master master315 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sun.getValue());	
		Master master316 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Mon.getValue());	
		Master master317 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Tue.getValue());	
		Master master318 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Wed.getValue());
		Master master319 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Thu.getValue());	
		Master master320 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Fri.getValue());	
		Master master321 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sat.getValue());	
		Master master322 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.You.getValue(), DayEnum.Sun.getValue());
		Master master323 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Mon.getValue());	
		Master master324 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Tue.getValue());
		Master master325 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Wed.getValue());	
		Master master326 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Thu.getValue());	
		Master master327 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Fri.getValue());	
		Master master328 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sat.getValue());
		Master master329 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Sun.getValue());	
		Master master330 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Mon.getValue());	
		Master master331 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Tue.getValue());	
		Master master332 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Wed.getValue());
		Master master333 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Thu.getValue());	
		Master master334 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.You.getValue(), DayEnum.Fri.getValue());
		Master master335 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Nov.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Sat.getValue());

//December

		Master master336 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 1, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Sun.getValue());
		Master master337 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 2, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Mon.getValue());
		Master master338 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 3, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Tue.getValue());
		Master master339 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 4, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());
		Master master340 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 5, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Thu.getValue());
		Master master341 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 6, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Yi.getValue(), BranchEnum.Hai.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Fri.getValue());
		Master master342 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 7, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Sat.getValue());	
		Master master343 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 8, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Sun.getValue());
		Master master344 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 9, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Mon.getValue());
		Master master345 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 10, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Tue.getValue());
		Master master346 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 11, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.You.getValue(), DayEnum.Wed.getValue());	
		Master master347 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 12, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Thu.getValue());
		Master master348 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 13, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Fri.getValue());
		Master master349 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 14, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Sat.getValue());	
		Master master350 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 15, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Sun.getValue());	
		Master master351 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 16, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Mon.getValue());
		Master master352 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 17, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Tue.getValue());
		Master master353 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 18, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Wed.getValue());
		Master master354 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 19, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Thu.getValue());
		Master master355 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 20, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Wu.getValue(), DayEnum.Fri.getValue());	
		Master master356 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 21, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Wei.getValue(), DayEnum.Sat.getValue());	
		Master master357 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 22, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Geng.getValue(),
				BranchEnum.Shen.getValue(), DayEnum.Sun.getValue());
		Master master358 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 23, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Xin.getValue(),
				BranchEnum.You.getValue(), DayEnum.Mon.getValue());
		Master master359 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 24, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ren.getValue(),
				BranchEnum.Xu.getValue(), DayEnum.Tue.getValue());	
		Master master360 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 25, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Gui.getValue(),
				BranchEnum.Hai.getValue(), DayEnum.Wed.getValue());	
		Master master361 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 26, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Jia.getValue(),
				BranchEnum.Zi.getValue(), DayEnum.Thu.getValue());
		Master master362 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 27, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Yi.getValue(),
				BranchEnum.Chou.getValue(), DayEnum.Fri.getValue());
		Master master363 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 28, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Bing.getValue(),
				BranchEnum.Yin.getValue(), DayEnum.Sat.getValue());
		Master master364 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 29, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ding.getValue(),
				BranchEnum.Mao.getValue(), DayEnum.Sun.getValue());
		Master master365 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 30, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Wu.getValue(),
				BranchEnum.Chen.getValue(), DayEnum.Mon.getValue());	
		Master master366 = new Master(1, YearEnum.Year.getValue(), MonthEnum.Dec.getValue(), 31, StemsEnum.Jia.getValue(),
				BranchEnum.Chen.getValue(), StemsEnum.Bing.getValue(), BranchEnum.Zi.getValue(), StemsEnum.Ji.getValue(),
				BranchEnum.Si.getValue(), DayEnum.Tue.getValue());	







//	Client and 			server side
//	(date,month,year)	(Year_stem,year branch
		
	
		masters.add(master1);
		masters.add(master2);
		masters.add(master3);
		masters.add(master4);
		masters.add(master5);
		masters.add(master6);
		masters.add(master7);
		masters.add(master8);
		masters.add(master9);
		masters.add(master10);
		masters.add(master11);
		masters.add(master12);
		masters.add(master13);
		masters.add(master14);
		masters.add(master15);
		masters.add(master16);
		masters.add(master17);
		masters.add(master18);
		masters.add(master19);
		masters.add(master20);
		masters.add(master21);
		masters.add(master22);
		masters.add(master23);
		masters.add(master24);
		masters.add(master25);
		masters.add(master26);
		masters.add(master27);
		masters.add(master28);
		masters.add(master29);
		masters.add(master30);
		masters.add(master31);
		masters.add(master32);
		masters.add(master33);
		masters.add(master34);
		masters.add(master35);
		masters.add(master36);
		masters.add(master37);
		masters.add(master38);
		masters.add(master39);
		masters.add(master40);
		masters.add(master41);
		masters.add(master42);
		masters.add(master43);
		masters.add(master44);
		masters.add(master45);
		masters.add(master46);
		masters.add(master47);
		masters.add(master48);
		masters.add(master49);
		masters.add(master50);
		masters.add(master51);
		masters.add(master52);
		masters.add(master53);
		masters.add(master54);
		masters.add(master55);
		masters.add(master56);
		masters.add(master57);
		masters.add(master58);
		masters.add(master59);
		masters.add(master60);
		masters.add(master61);
		masters.add(master62);
		masters.add(master63);
		masters.add(master64);
		masters.add(master65);
		masters.add(master66);
		masters.add(master67);
		masters.add(master68);
		masters.add(master69);
		masters.add(master70);
		masters.add(master71);
		masters.add(master72);
		masters.add(master73);
		masters.add(master74);
		masters.add(master75);
		masters.add(master76);
		masters.add(master77);
		masters.add(master78);
		masters.add(master79);
		masters.add(master80);
		masters.add(master81);
		masters.add(master82);
		masters.add(master83);
		masters.add(master84);
		masters.add(master85);
		masters.add(master86);
		masters.add(master87);
		masters.add(master88);
		masters.add(master89);
		masters.add(master90);
		masters.add(master91);
		masters.add(master92);
		masters.add(master93);
		masters.add(master94);
		masters.add(master95);
		masters.add(master96);
		masters.add(master97);
		masters.add(master98);
		masters.add(master99);
		masters.add(master100);
		masters.add(master101);
		masters.add(master102);
		masters.add(master103);
		masters.add(master104);
		masters.add(master105);
		masters.add(master106);
		masters.add(master107);
		masters.add(master108);
		masters.add(master109);
		masters.add(master110);
		masters.add(master111);
		masters.add(master112);
		masters.add(master113);
		masters.add(master114);
		masters.add(master115);
		masters.add(master116);
		masters.add(master117);
		masters.add(master118);
		masters.add(master119);
		masters.add(master120);
		masters.add(master121);
		masters.add(master122);
		masters.add(master123);
		masters.add(master124);
		masters.add(master125);
		masters.add(master126);
		masters.add(master127);
		masters.add(master128);
		masters.add(master129);
		masters.add(master130);
		masters.add(master131);
		masters.add(master132);
		masters.add(master133);
		masters.add(master134);
		masters.add(master135);
		masters.add(master136);
		masters.add(master137);
		masters.add(master138);
		masters.add(master139);
		masters.add(master140);
		masters.add(master141);
		masters.add(master142);
		masters.add(master143);
		masters.add(master144);
		masters.add(master145);
		masters.add(master146);
		masters.add(master147);
		masters.add(master148);
		masters.add(master149);
		masters.add(master150);
		masters.add(master151);
		masters.add(master152);
		masters.add(master153);
		masters.add(master154);
		masters.add(master155);
		masters.add(master156);
		masters.add(master157);
		masters.add(master158);
		masters.add(master159);
		masters.add(master160);
		masters.add(master161);
		masters.add(master162);
		masters.add(master163);
		masters.add(master164);
		masters.add(master165);
		masters.add(master166);
		masters.add(master167);
		masters.add(master168);
		masters.add(master169);
		masters.add(master170);
		masters.add(master171);
		masters.add(master172);
		masters.add(master173);
		masters.add(master174);
		masters.add(master175);
		masters.add(master176);
		masters.add(master177);
		masters.add(master178);
		masters.add(master179);
		masters.add(master180);
		masters.add(master181);
		masters.add(master182);
		masters.add(master183);
		masters.add(master184);
		masters.add(master185);
		masters.add(master186);
		masters.add(master187);
		masters.add(master188);
		masters.add(master189);
		masters.add(master190);
		masters.add(master191);
		masters.add(master192);
		masters.add(master193);
		masters.add(master194);
		masters.add(master195);
		masters.add(master196);
		masters.add(master197);
		masters.add(master198);
		masters.add(master199);
		masters.add(master200);
		masters.add(master201);
		masters.add(master202);
		masters.add(master203);
		masters.add(master204);
		masters.add(master205);
		masters.add(master206);
		masters.add(master207);
		masters.add(master208);
		masters.add(master209);
		masters.add(master210);
		masters.add(master211);
		masters.add(master212);
		masters.add(master213);
		masters.add(master214);
		masters.add(master215);
		masters.add(master216);
		masters.add(master217);
		masters.add(master218);
		masters.add(master219);
		masters.add(master220);
		masters.add(master221);
		masters.add(master222);
		masters.add(master223);
		masters.add(master224);
		masters.add(master225);
		masters.add(master226);
		masters.add(master227);
		masters.add(master228);
		masters.add(master229);
		masters.add(master230);
		masters.add(master231);
		masters.add(master232);
		masters.add(master233);
		masters.add(master234);
		masters.add(master235);
		masters.add(master236);
		masters.add(master237);
		masters.add(master238);
		masters.add(master239);
		masters.add(master240);
		masters.add(master241);
		masters.add(master242);
		masters.add(master243);
		masters.add(master244);
		masters.add(master245);
		masters.add(master246);
		masters.add(master247);
		masters.add(master248);
		masters.add(master249);
		masters.add(master250);
		masters.add(master251);
		masters.add(master252);
		masters.add(master253);
		masters.add(master254);
		masters.add(master255);
		masters.add(master256);
		masters.add(master257);
		masters.add(master258);
		masters.add(master259);
		masters.add(master260);
		masters.add(master261);
		masters.add(master262);
		masters.add(master263);
		masters.add(master264);
		masters.add(master265);
		masters.add(master266);
		masters.add(master267);
		masters.add(master268);
		masters.add(master269);
		masters.add(master270);
		masters.add(master271);
		masters.add(master272);
		masters.add(master273);
		masters.add(master274);
		masters.add(master275);
		masters.add(master276);
		masters.add(master277);
		masters.add(master278);
		masters.add(master279);
		masters.add(master280);
		masters.add(master281);
		masters.add(master282);
		masters.add(master283);
		masters.add(master284);
		masters.add(master285);
		masters.add(master286);
		masters.add(master287);
		masters.add(master288);
		masters.add(master289);
		masters.add(master290);
		masters.add(master291);
		masters.add(master292);
		masters.add(master293);
		masters.add(master294);
		masters.add(master295);
		masters.add(master296);
		masters.add(master297);
		masters.add(master298);
		masters.add(master299);
		masters.add(master300);
		masters.add(master301);
		masters.add(master302);
		masters.add(master303);
		masters.add(master304);
		masters.add(master305);
		masters.add(master306);
		masters.add(master307);
		masters.add(master308);
		masters.add(master309);
		masters.add(master310);
		masters.add(master311);
		masters.add(master312);
		masters.add(master313);
		masters.add(master314);
		masters.add(master315);
		masters.add(master316);
		masters.add(master317);
		masters.add(master318);
		masters.add(master319);
		masters.add(master320);
		masters.add(master321);
		masters.add(master322);
		masters.add(master323);
		masters.add(master324);
		masters.add(master325);
		masters.add(master326);
		masters.add(master327);
		masters.add(master328);
		masters.add(master329);
		masters.add(master330);
		masters.add(master331);
		masters.add(master332);
		masters.add(master333);
		masters.add(master334);
		masters.add(master335);
		masters.add(master336);
		masters.add(master337);
		masters.add(master338);
		masters.add(master339);
		masters.add(master340);
		masters.add(master341);
		masters.add(master342);
		masters.add(master343);
		masters.add(master344);
		masters.add(master345);
		masters.add(master346);
		masters.add(master347);
		masters.add(master348);
		masters.add(master349);
		masters.add(master350);
		masters.add(master351);
		masters.add(master352);
		masters.add(master353);
		masters.add(master354);
		masters.add(master355);
		masters.add(master356);
		masters.add(master357);
		masters.add(master358);
		masters.add(master359);
		masters.add(master360);
		masters.add(master361);
		masters.add(master362);
		masters.add(master363);
		masters.add(master364);
		masters.add(master365);
		masters.add(master366);

		
		masterRepo.saveAll(masters);

	}
	
}
