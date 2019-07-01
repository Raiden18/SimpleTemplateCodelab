package com.livetyping.templatecodelab.exercise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.livetyping.templatecodelab.R
import com.livetyping.templatecodelab.common.Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val models = arrayListOf<Model>()

    private val adapter by lazy {
      /* ModelsAdapter(::onItemClick)*/
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initModels()
        initRecycler()
    }

    private fun initRecycler() {
        recycler.layoutManager = LinearLayoutManager(this)
    /*    recycler.adapter = adapter
        adapter.swapItems(models)*/
    }

    private fun onItemClick(model: Model) {
        Toast.makeText(this, model.id.toString(), Toast.LENGTH_SHORT).show()
    }

    private fun initModels() {
        for (i in 0 until 25) {
            createModelWithIdAndAddToList(i)
        }
    }

    private fun createModelWithIdAndAddToList(id: Int) {
        val model = Model(id)
        models.add(model)
    }
}
