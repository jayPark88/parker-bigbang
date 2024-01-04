package com.parker.jpa.intf;

/**
 * com.parker.jpa.intf
 * ㄴ ChangeableToFromEntity
 *
 * <pre>
 * description : Model To Entity, Entity To Model변환 인터페이스
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 *  parker, 1.0, 11/5/23  초기작성
 * </pre>
 *
 * @author parker
 * @version 1.0
 */
public interface ChangeableToFromEntity <E>{
    public E to();
    public void from(E entity);
}