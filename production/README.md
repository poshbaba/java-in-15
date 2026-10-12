# Production guide

[Course homepage](../README.md) · [Curriculum](../docs/curriculum.md)

## Production standards

### Teaching and pacing

- Use the agreed six-part timing table as the standard template. Prioritize understanding over exactly filling 15 minutes.
- Preserve the detailed Day 1 script’s existing timing, which targets roughly 14 minutes 30 seconds within its original 12–15 minute range. Its microsegments do not exactly match the later general template.
- Introduce one primary concept per episode, demonstrate real code, explain one deliberate beginner mistake, and include a challenge and solution walkthrough.
- For the challenge segment, explain requirements, expected behavior, and a useful hint. Ask viewers to pause; keep the challenge card visible for about five seconds. Avoid long stretches of silence to fill the allotted three minutes.
- Reveal code progressively, ask learners to predict output, then run it. Separate intentionally broken examples from the final working code.

### AI-cloned narration

Use the creator’s own cloned voice, with ElevenLabs as the planned narration tool. Aim for a professional, approachable, conversational teaching voice.

- Generate narration by section so individual clips can be corrected independently.
- Keep spoken narration separate from `[PAUSE]`, `[SCREEN]`, and editor directions; do not send those directions to speech synthesis.
- Explain the code’s meaning instead of reading punctuation character by character.
- Target approximately 125–145 spoken words per minute; slow down for new technical ideas.
- Use pauses of roughly 0.3–0.8 seconds between ideas and 1–1.5 seconds for major transitions. Let the viewer inspect the code.
- Review an opening sample of 30–45 seconds before generating the remaining narration. Avoid exaggerated enthusiasm, announcer delivery, and dramatic pauses after every sentence.

| On-screen term | Spoken form |
|---|---|
| Java | Jah-vuh |
| IntelliJ | in-TELL-ih-jay |
| int | int |
| boolean | BOO-lee-un |
| CPU / API | C-P-U / A-P-I |
| PROD | prod |
| cpuUsage | CPU usage |
| booking-api | booking API |
| System.out.println | print, or print to the console |

For example, `String application = "booking-api";` is explained as: “We’re creating a String named application and storing the text booking API inside it.”

### Visuals and Remotion

Use Remotion for concept animations, syntax highlighting, progressive code reveals, and transitions. Use IntelliJ demonstrations for executable code and actual console output. The following are practical production defaults supporting the agreed approach:

- Produce a consistent 16:9 frame, preferably 1920 × 1080, with readable code and strong contrast.
- Highlight the line being explained and match reveals to narration. Hold output long enough to read it.
- Keep fonts, colors, segment labels, transitions, and episode numbering consistent.
- Verify captions against narration, especially Java keywords and identifiers. Keep captions clear of code and console output.
- Review the rendered video for clipped text, incorrect output, abrupt audio edits, and transitions that obscure the lesson.

### Release checklist

- [ ] Demo and challenge solution compile and run using Java 21.
- [ ] Recorded output matches the repository example.
- [ ] Learning objectives, topic boundaries, and challenge acceptance criteria agree.
- [ ] Intentional errors are explained and corrected before the final run.
- [ ] Narration and code reveals align; production directions are absent from spoken audio.
- [ ] Captions, code, output, and challenge cards remain readable.
- [ ] Title, thumbnail, description, and playlist use consistent episode numbering.
- [ ] The description links to this repository and the relevant episode folder.
- [ ] The recap states what was learned and previews the next topic.

