(ns hello-lti.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[hello-lti started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[hello-lti has shut down successfully]=-"))
   :middleware identity})
