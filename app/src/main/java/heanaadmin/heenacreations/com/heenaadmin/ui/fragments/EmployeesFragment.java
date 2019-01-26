package heanaadmin.heenacreations.com.heenaadmin.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import heanaadmin.heenacreations.com.heenaadmin.R;
import heanaadmin.heenacreations.com.heenaadmin.ui.adapters.EmployeeAdapter;

/**
 * Employees screen
 */
public class EmployeesFragment extends Fragment {

    private View rootView;
    private RecyclerView mRecyclerView;

    public EmployeesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_employees, container, false);
        init(rootView);
        loadData();
        return rootView;
    }

    /**
     * Load data on recycler view
     */
    private void loadData() {
        RecyclerView.LayoutManager layoutManager
                = new LinearLayoutManager(getContext().getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new EmployeeAdapter());
    }

    /**
     * UI initialization
     * @param rootView
     */
    private void init(View rootView) {
       mRecyclerView = rootView.findViewById(R.id.recycler_view_employee);
    }
}
