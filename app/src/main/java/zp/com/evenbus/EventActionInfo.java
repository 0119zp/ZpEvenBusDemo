package zp.com.evenbus;

import android.os.Bundle;

/**
 * 通知的专用类
 * 其中action字段作为这个通知类的唯一标识，用于区分不同的通知对象
 */
public class EventActionInfo {

    /** 信息类型的唯一标识 */
    private String action;

    /** 基本的文本信息 */
    public String stringValue;
    /** int型变量 */
    public int intValue;
    /** 任意类型变量 */
    public Object obj;
    /** 传递Bundle对象 */
    public Bundle bundle;

    private EventActionInfo() {
    }

    public EventActionInfo(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
