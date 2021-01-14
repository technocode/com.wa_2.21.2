package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.2fe  reason: invalid class name and case insensitive filesystem */
public class C54882fe extends AbstractC11910hD {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final C11930hF A04;

    public C54882fe(GroupAdminPickerActivity groupAdminPickerActivity, View view) {
        super(view);
        this.A04 = new C11930hF(view, R.id.name, groupAdminPickerActivity.A0I, groupAdminPickerActivity.A0K, groupAdminPickerActivity.A0O);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.status);
        this.A00 = (ImageView) view.findViewById(R.id.avatar);
        this.A01 = (TextView) view.findViewById(R.id.owner);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        AnonymousClass0Q7.A0W(this.A00, 2);
        C11930hF r2 = this.A04;
        r2.A00.setTextColor(C004302a.A00(view.getContext(), R.color.list_item_title));
        this.A03.setTextColor(C004302a.A00(view.getContext(), R.color.list_item_sub_title));
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setOnClickListener(groupAdminPickerActivity.A0D);
    }
}
