package com.proastro.gua.insertScript;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proastro.gua.entities.Master;
import com.proastro.gua.entities.Stems;
import com.proastro.gua.enums.BranchEnum;
import com.proastro.gua.enums.DayEnum;
import com.proastro.gua.enums.HourRangeEnum;
import com.proastro.gua.enums.MonthEnum;
import com.proastro.gua.enums.StemsEnum;
import com.proastro.gua.enums.YearEnum;
import com.proastro.gua.repo.MasterRepo;
import com.proastro.gua.repo.StemsRepo;

import ch.qos.logback.core.model.conditional.IfModel.BranchState;

@Component
public class InsertScript {

	@Autowired
	StemsRepo StemsRepo;
	
	@Autowired
	MasterRepo masterRepo;
	
	public void storeRecordInStems() {
		
		List<Stems> allRecords = new ArrayList<>();
		
//		HOUR_00_00_TO_00_59 AND ALL MONTHS
		Stems stems = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Jan.getValue(), BranchEnum.Jia.getValue());
		Stems stems1 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Feb.getValue(), BranchEnum.Bing.getValue());
		Stems stems2 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Mar.getValue(), BranchEnum.Wu.getValue());
		Stems stems3 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Apr.getValue(), BranchEnum.Geng.getValue());
		Stems stems4 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.May.getValue(), BranchEnum.Ren.getValue());
		Stems stems5 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Jun.getValue(), BranchEnum.Jia.getValue());
		Stems stems6 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Jul.getValue(), BranchEnum.Bing.getValue());
		Stems stems7 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Aug.getValue(), BranchEnum.Wu.getValue());
		Stems stems8 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Sep.getValue(), BranchEnum.Geng.getValue());
		Stems stems9 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Oct.getValue(), BranchEnum.Ren.getValue());
		Stems stems10 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Nov.getValue(), BranchEnum.Jia.getValue());
		Stems stems11 = new Stems(1, HourRangeEnum.HOUR_00_00_TO_00_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Dec.getValue(), BranchEnum.Bing.getValue());
		
//		HOUR_01_00_TO_02_59 AND ALL MONTHS 
		Stems stems12 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Jan.getValue(), BranchEnum.Yi.getValue());
		Stems stems13 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Feb.getValue(), BranchEnum.Ding.getValue());
		Stems stems14 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Mar.getValue(), BranchEnum.Ji.getValue());
		Stems stems15 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Apr.getValue(), BranchEnum.Xin.getValue());
		Stems stems16 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.May.getValue(), BranchEnum.Gui.getValue());
		Stems stems17 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Jun.getValue(), BranchEnum.Yi.getValue());
		Stems stems18 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Jul.getValue(), BranchEnum.Ding.getValue());
		Stems stems19 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Aug.getValue(), BranchEnum.Ji.getValue());
		Stems stems20 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Sep.getValue(), BranchEnum.Xin.getValue());
		Stems stems21 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Oct.getValue(), BranchEnum.Gui.getValue());
		Stems stems22 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Nov.getValue(), BranchEnum.Yi.getValue());
		Stems stems23 = new Stems(1, HourRangeEnum.HOUR_01_00_TO_02_59.getValue(), StemsEnum.Zi.getValue(),
				MonthEnum.Dec.getValue(), BranchEnum.Ding.getValue());

//		HOUR_03_00_TO_04_59 AND ALL MONTHS 
		Stems stems24 = new Stems(1, HourRangeEnum.HOUR_03_00_TO_04_59.getValue(), StemsEnum.Yin.getValue(),
				MonthEnum.Jan.getValue(), BranchEnum.Bing.getValue());

		allRecords.add(stems);
		allRecords.add(stems1);
		allRecords.add(stems2);
		allRecords.add(stems3);
		allRecords.add(stems4);
		allRecords.add(stems5);
		allRecords.add(stems6);
		allRecords.add(stems7);
		allRecords.add(stems8);
		allRecords.add(stems9);
		allRecords.add(stems10);
		allRecords.add(stems11);
		
		
		
		StemsRepo.saveAll(allRecords);
		

		
		
	}
	
	public void storeRecordInMaster() {

		Master master = new Master(1, YearEnum.Year.getValue(), MonthEnum.Jan.getValue(), 01, BranchEnum.Gui.getValue(),
				StemsEnum.Mao.getValue(), BranchEnum.Jia.getValue(), StemsEnum.Zi.getValue(), BranchEnum.Jia.getValue(),
				StemsEnum.Zi.getValue(), DayEnum.Mon.getValue());

		masterRepo.save(master);

	}
	
}
