package com.mgireesh;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger {
	// NestedInteger nInt = "{{1,2},3,{4,{5,6}}}";
	private Integer m_intVal;
	private List<NestedInteger> m_list;

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
			for (NestedInteger current : m_list) {
				string.append(", " + current.toString());
			}
		}
		string.append("}");
		return string.toString();
	}
}
