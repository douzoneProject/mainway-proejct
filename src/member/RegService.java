package member;

public class RegService {
	public void regStage(RegDTO reg) {
		RegDAO regDao = new RegDAO();
		regDao.regStage(reg);
	}

	public void idOverlapSrage(RegDTO idoverlap) {
//		RegDAO dao = new RegDAO();
//		dao.idOverlapStage(idoverlap);
	}
}
