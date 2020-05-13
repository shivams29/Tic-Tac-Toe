<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

<TextView
        android:id="@+id/textView"
                android:layout_width="292dp"
                android:layout_height="63dp"
                android:layout_marginLeft="40dp"
                android:layout_marginTop="30dp"
                android:layout_marginRight="25dp"
                android:text="@string/heading"
                android:textColor="#962154"
                android:textSize="36sp"
                android:textStyle="bold|italic"
                app:fontFamily="casual"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.61"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />

<ImageView
        android:id="@+id/imageView"
                android:layout_width="588dp"
                android:layout_height="716dp"
                android:contentDescription="Main Grid"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/textView"
                app:srcCompat="@drawable/realgrid" />

<LinearLayout
        android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                app:layout_constraintBottom_toBottomOf="@+id/imageView"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent">

<LinearLayout
            android:layout_width="match_parent"
                    android:layout_height="171dp"
                    android:layout_weight="1"
                    android:orientation="horizontal">

<ImageView
                android:id="@+id/imageView0"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="0" />

<ImageView
                android:id="@+id/imageView1"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="1" />

<ImageView
                android:id="@+id/imageView2"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="2"/>
</LinearLayout>

<LinearLayout
            android:layout_width="match_parent"
                    android:layout_height="153dp"
                    android:layout_weight="1"
                    android:orientation="horizontal">

<ImageView
                android:id="@+id/imageView3"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="3" />

<ImageView
                android:id="@+id/imageView4"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="4" />

<ImageView
                android:id="@+id/imageView5"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="5" />
</LinearLayout>

<LinearLayout
            android:layout_width="match_parent"
                    android:layout_height="150dp"
                    android:layout_weight="1"
                    android:orientation="horizontal">

<ImageView
                android:id="@+id/imageView6"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="6" />

<ImageView
                android:id="@+id/imageView7"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="7" />

<ImageView
                android:id="@+id/imageView8"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:onClick="Tap"
                        android:padding="10sp"
                        android:tag="8" />
</LinearLayout>

</LinearLayout>

<TextView
        android:id="@+id/status"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="25sp"
                android:text="START THE GAME PLAYERS !!!!!"
                android:textSize="18sp"
                android:textStyle="bold"
                app:fontFamily="cursive"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>