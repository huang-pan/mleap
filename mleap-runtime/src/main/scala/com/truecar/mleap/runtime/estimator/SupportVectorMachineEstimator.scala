package com.truecar.mleap.runtime.estimator

/**
  * Created by hollinwilkins on 4/14/16.
  */
case class SupportVectorMachineEstimator(name: String = Estimator.createName("supportVectorMachine"),
                                         numIterations: Int,
                                         fitIntercept: Boolean = true,
                                         stepSize: Double = 1.0,
                                         regParam: Double = 0.01,
                                         miniBatchFraction: Double = 1.0,
                                         threshold: Option[Double] = None,
                                         featuresCol: String,
                                         labelCol: String,
                                         predictionCol: String) extends Estimator
