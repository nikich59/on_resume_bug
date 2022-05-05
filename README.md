# on_resume_bug
This reproduces a bug when ::onResume callback of a Fragment is not called provided that the fragment has exit&enter transitions
- Button "REPRODUCE BUG" does a simple fragment transaction with enabled exit&enter transitions which reproduces the bug
- Button "DO TRANSITION WITHOUT BUG" does the same transaction without enabled transitions. This completes successfully and leads to the onResume being called
