package com.example.laboratorio07miranda.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.laboratorio07miranda.R
import com.example.laboratorio07miranda.databinding.FragmentBillboardBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillboardFragment : Fragment() {

    private lateinit var binding: FragmentBillboardBinding


    private lateinit var btnCreateNewMovie: FloatingActionButton
    private lateinit var starWarsCv: CardView
    private lateinit var harryPotterCv: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_billboard, container, false)
        binding = FragmentBillboardBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        btnCreateNewMovie = view.findViewById(R.id.btnNavCreateNewMovie)
//        starWarsCv = view.findViewById(R.id.starWarsCardView)
//        harryPotterCv = view.findViewById(R.id.harryPotterCardView)

        //        btnCreateNewMovie.setOnClickListener {
//            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
//        }

        binding.btnNavCreateNewMovie.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)

        }

        binding.starWarsCardView.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }

        binding.harryPotterCardView.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }


    }

}