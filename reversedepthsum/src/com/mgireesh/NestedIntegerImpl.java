package com.mgireesh;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger {
	// NestedInteger nInt = "{{1,2},3,{4,{5,6}}}";
	private Integer m_intVal;
	private List<NestedInteger> m_list;

	public Integer length;

	public NestedIntegerImpl(Integer intVal) {
		m_intVal = intVal;
	}

	public NestedIntegerImpl(List<NestedInteger> list) {
		m_list = list;
	}

	@Override
	public boolean isInteger() {
		if (m_intVal != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Integer getInteger() {
		return m_intVal;
	}

	@Override
	public List<NestedInteger> getList() {
		return m_list;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();

		string.append("{");
		if (null != m_intVal) {
			string.append(m_intVal);
		}

		if (null != m_list) {
			for (int i = 0; i < m_list.size() - 1; i++) {
				string.append(m_list.get(i).toString() + ", ");
			}
			string.append(m_list.get(m_list.size() - 1).toString());
		}
		string.append("}");
		return string.toString();
	}
}
