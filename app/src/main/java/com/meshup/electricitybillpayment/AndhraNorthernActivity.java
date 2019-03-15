package com.meshup.electricitybillpayment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class AndhraNorthernActivity extends AppCompatActivity {

    private WebView webView;
    private static final String  buy_url = "http://ww1.apnpdcl.in/caf/?ses=Y3JlPTE1NTA2NjQ3OTkmdGNpZD13dzEuYXBucGRjbC5pbjVjNmQ0NDVmMDU2NmQyLjMwMTAzNjEzJmZraT0wJnRhc2s9c2VhcmNoJmRvbWFpbj1hcG5wZGNsLmluJmxhbmd1YWdlPWVuJmFfaWQ9MyZzZXNzaW9uPWpoQVFWY091ZjcxYk10RVBaZkVp&query=Electricity%20Bill&afdToken=3B1g3SiBPcyVrBWNwvTMQTDy0NVu1GkUtU2VrX8eiDdB-_jss68yTfaLpMFsNny7Y3K-YVJxXgf8s9ESra1rCAqCwHJ_dsjAPp5DuUvFEQ";
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new AndhraNorthernActivity.MyBrowser());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setInitialScale(30);
        webView.loadUrl(buy_url);
        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(AndhraNorthernActivity.this);
        // Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
        interstitial.loadAd(adRequest);
       // Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
       // Call displayInterstitial() function
                displayInterstitial();
            }
            public void displayInterstitial() {
       // If Ads are loaded, show Interstitial else show nothing.
                if (interstitial.isLoaded()) {
                    interstitial.show();
                }
            }
        });
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
