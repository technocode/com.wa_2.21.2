package X;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.29v  reason: invalid class name and case insensitive filesystem */
public class C463729v extends AbstractC42331wX {
    public int A00;
    public final Button A01;
    public final LinearLayout A02;
    public final ProgressBar A03;
    public final TextView A04;
    public final C014308b A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass01P A07;

    public C463729v(AnonymousClass02M r2, AnonymousClass01I r3, C02780Dk r4, AnonymousClass01A r5, C014308b r6, AnonymousClass01X r7, AnonymousClass0HL r8, AnonymousClass01P r9, View view) {
        super(r3, r4, r5, view);
        this.A03 = (ProgressBar) view.findViewById(R.id.catalog_list_footer_loading_spinner);
        this.A02 = (LinearLayout) view.findViewById(R.id.catalog_list_footer_end_of_results);
        this.A04 = (TextView) view.findViewById(R.id.catalog_list_footer_end_of_results_title);
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r9;
        this.A01 = (Button) view.findViewById(R.id.end_of_results_button);
    }
}
