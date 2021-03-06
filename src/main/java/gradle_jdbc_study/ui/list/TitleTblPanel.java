package gradle_jdbc_study.ui.list;

import javax.swing.SwingConstants;

import gradle_jdbc_study.dto.Title;

@SuppressWarnings("serial")
public class TitleTblPanel extends AbstractTblPanel<Title> {

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(50, 150);
		tableCellAlign(SwingConstants.CENTER, 0, 1);		
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"번호", "직책명"};
	}

	@Override
	protected Object[] toArray(Title item) {
		return new Object[] {item.getTitleNo(), item.getTitleName()};
	}

	@Override
	public void updateRow(Title item, int updateIdx) {
		model.setValueAt(item.getTitleNo(), updateIdx, 0);//학생번호
		model.setValueAt(item.getTitleName(), updateIdx, 1);		
	}

	@Override
	public Title getSelectedItem() {
		int selectedIdx = getSelectedRowIdx();
		int titleNo = (int) model.getValueAt(selectedIdx, 0);
		String titleName = (String) model.getValueAt(selectedIdx, 1);
		return new Title(titleNo, titleName);
	}

}
