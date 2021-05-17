(ns mygameidea.core
  (:gen-class))

(require '[clojure.math.combinatorics :as combo])
(import 
  com.github.sarxos.webcam.Webcam
  com.github.sarxos.webcam.WebcamPanel
  com.github.sarxos.webcam.WebcamResolution
  javax.swing.JFrame)

(defn get-colors-from-buffered-image
  [bfImg]
  (map 
    (fn [[x y]] 
      (let [c (java.awt.Color. (.getRGB bfImg x y))]
        [(.getRed c) (.getGreen c) (.getBlue c)]))
    (combo/cartesian-product
      (range (.getWidth bfImg)) 
      (range (.getHeight bfImg)))))

(defn do-regular-shit
  []
  (def cam (Webcam/getDefault))
  (.setViewSize cam (.getSize WebcamResolution/VGA))

  (def panel (WebcamPanel. cam))

  (doto panel
    (.setFPSDisplayed true)
    (.setDisplayDebugInfo true)
    (.setImageSizeDisplayed true)
    (.setMirrored true))

  (def window (JFrame. "MyGameIdea"))
  (doto window
    (.add panel)
    (.setResizable true)
    (.setDefaultCloseOperation (JFrame/EXIT_ON_CLOSE))
    (.pack)
    (.setVisible true)))

(defn -main 
  [& args]
)