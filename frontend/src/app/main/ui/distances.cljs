(ns app.main.ui.distances
  (:require
   [app.common.geom.shapes :as gsh]))

(defn render-distance [distance]
  (when (pos? distance)
    ;; draw lines
    (println distance)))

(defn distance-shapes [alt? select hover]
  (when alt?
    (let [{:keys [dist-x dist-y]} (gsh/distance-of-bounds hover select)]
      (render-distance dist-x)
      (render-distance dist-y))))
