import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jdom.input.SAXBuilder;

public class JdomSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXBuilder sb = new SAXBuilder();
		org.jdom.Document doc = sb.build(JdomSample.class.getClassLoader().getResourceAsStream("test.xml"));
		org.jdom.Element root = ((org.jdom.Document) doc).getRootElement();//��ȡ��Ԫ��
		List list = root.getChildren("disk");//��ȡ��Ԫ����������Ϊdisk����Ԫ��
		for (int i = 0; i < list.size(); i++) {
			org.jdom.Element element = (org.jdom.Element) list.get(i);
			String name = element.getAttributeValue("name");
			String capacity = element.getChildText("capacity");
			String directories = element.getChildText("directories");
			String files = element.getChildText("files");
			System.out.println("������Ϣ");
			System.out.println("�����̷���" + name);
			System.out.println("����������" + capacity);
			System.out.println("Ŀ¼����" + directories);
			System.out.println("�ļ�����" + files);
			System.out.println("------------------------");
		}
	}
}
