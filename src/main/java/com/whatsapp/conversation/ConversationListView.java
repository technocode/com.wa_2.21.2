package com.whatsapp.conversation;

import X.AnonymousClass008;
import X.C09570dA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.util.Log;

public class ConversationListView extends ListView {
    public C09570dA A00 = new C09570dA();

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View selectedView;
        if (keyEvent.getKeyCode() != 23 || (selectedView = getSelectedView()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return selectedView.dispatchKeyEvent(keyEvent);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        ListAdapter adapter = getAdapter();
        if (i != -1 && adapter != null) {
            if (i >= adapter.getCount()) {
                StringBuilder A0T = AnonymousClass008.A0T("conversationvistview/onInitializeAccessibilityNodeInfoForItem pos:", i, " count:");
                A0T.append(adapter.getCount());
                Log.w(A0T.toString());
                return;
            }
            super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        this.A00.A01();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                view = null;
                break;
            }
            view = getChildAt(i5);
            if (view.isPressed()) {
                break;
            }
            i5++;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (view != null && !view.isPressed()) {
            view.setPressed(true);
        }
        this.A00.A00();
    }

    public void onMeasure(int i, int i2) {
        if (getTranscriptMode() == 2) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(1, mode);
            }
        }
        super.onMeasure(i, i2);
    }
}
