(ns cog.core
  (:require [cog.state :as state]
            [figwheel.client :as fw]))

(enable-console-print!)



(fw/start {
           :on-jsload (fn []
                        (js/React.render (js/React.DOM.p nil state/cog) (.-body js/document))
                        (println "a cog" state/cog)
                        )})
