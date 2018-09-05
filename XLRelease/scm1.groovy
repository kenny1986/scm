// Exported from:        http://Kenny-Dell:5516/#/templates/Releaseef5b1c1c04c45c4bc1a0905d191296d/releasefile
// XL Release version:   8.2.0
// Date created:         Wed Sep 05 13:03:15 CEST 2018

xlr {
  template('scm1') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-09-05T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('M1') {
            
          }
        }
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#reassign_task', 'release#edit_security', 'release#view', 'release#lock_task', 'release#start', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#abort', 'release#edit_task'
      }
    }
  }
}