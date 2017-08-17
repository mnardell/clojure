(ns hello-lti.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [hello-lti.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hello-lti started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hello-lti has shut down successfully]=-"))
   :middleware wrap-dev})
