package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2JA  reason: invalid class name */
public final class AnonymousClass2JA extends FrameLayout {
    public View A00 = findViewById(R.id.content);
    public View A01 = findViewById(R.id.divider);
    public TextView A02 = ((TextView) findViewById(R.id.add_btn));
    public TextView A03 = ((TextView) findViewById(R.id.block_btn));
    public AnonymousClass0GG A04;
    public AnonymousClass01X A05;
    public C006903j A06;

    public AnonymousClass2JA(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.conversation_block_add_header, this);
    }
}
