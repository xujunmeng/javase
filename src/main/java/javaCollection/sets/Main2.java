package javaCollection.sets;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
@author junmeng.xu
@date  2016年4月21日下午2:07:26
 */
public class Main2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setLevel(1);
		p1.setRtype("M");
		p1.setSamcd("EE001002");
		p1.setIdxcd("GBCAAAC");
		p1.setSamnm("光学设备和仪器");
		Person p2 = new Person();
		p2.setLevel(1);
		p2.setRtype("M");
		p2.setSamcd("EE001002");
		p2.setIdxcd("GBCAAAC");
		p2.setSamnm("光学设备和仪器");
		Set<Person> set = new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		for (Person person : set) {
			System.out.println(person);
		}
		
	}
	
}
class Person implements Serializable {
	private static final long serialVersionUID = 503038982281472596L;
	private Integer level;
	private String rtype;
	private String samcd;
	private String idxcd;
	private String samnm;
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public String getSamcd() {
		return samcd;
	}
	public void setSamcd(String samcd) {
		this.samcd = samcd;
	}
	public String getIdxcd() {
		return idxcd;
	}
	public void setIdxcd(String idxcd) {
		this.idxcd = idxcd;
	}
	public String getSamnm() {
		return samnm;
	}
	public void setSamnm(String samnm) {
		this.samnm = samnm;
	}
	@Override
	public String toString() {
		return "Person [level=" + level + ", rtype=" + rtype + ", samcd="
				+ samcd + ", idxcd=" + idxcd + ", samnm=" + samnm + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idxcd == null) ? 0 : idxcd.hashCode());
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((rtype == null) ? 0 : rtype.hashCode());
		result = prime * result + ((samcd == null) ? 0 : samcd.hashCode());
		result = prime * result + ((samnm == null) ? 0 : samnm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (idxcd == null) {
			if (other.idxcd != null)
				return false;
		} else if (!idxcd.equals(other.idxcd))
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (rtype == null) {
			if (other.rtype != null)
				return false;
		} else if (!rtype.equals(other.rtype))
			return false;
		if (samcd == null) {
			if (other.samcd != null)
				return false;
		} else if (!samcd.equals(other.samcd))
			return false;
		if (samnm == null) {
			if (other.samnm != null)
				return false;
		} else if (!samnm.equals(other.samnm))
			return false;
		return true;
	}

}
